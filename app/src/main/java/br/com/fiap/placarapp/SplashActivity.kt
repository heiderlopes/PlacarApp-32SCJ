package br.com.fiap.placarapp

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashViewModel = ViewModelProviders.of(this)
                .get(SplashViewModel::class.java)

        splashViewModel.load()

        startAnim()

        splashViewModel.loading.observe(this, Observer {
            if(it == false) {
                startActivity(Intent(this, ClubesActivity::class.java))
                finish()
            }
        })
    }

    private fun startAnim() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.splash)
        ivLogo.startAnimation(anim)
    }
}
