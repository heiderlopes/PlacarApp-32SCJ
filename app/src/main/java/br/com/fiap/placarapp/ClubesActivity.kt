package br.com.fiap.placarapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.placarapp.extensions.value
import kotlinx.android.synthetic.main.activity_clubes.*

class ClubesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clubes)

        btIniciar.setOnClickListener { minhaView ->
            irParaOutraTela()
        }
    }

    fun irParaOutraTela() {
        val proximaTela = Intent(this, PlacarActivity::class.java)
        proximaTela.putExtra("TIME_CASA", inputClubeCasa.value())
        proximaTela.putExtra("TIME_VISITANTE", inputClubeVisitante.value())
        startActivity(proximaTela)
    }
}
