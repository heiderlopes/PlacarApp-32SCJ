package br.com.fiap.placarapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var golCasa = 0
    private var golVisitante = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        tvTimeCasa.text = intent.getStringExtra("TIME_CASA")
        tvTimeVisitante.text = intent.getStringExtra("TIME_VISITANTE")

        tvPlacarCasa.text = "$golCasa"
        tvPlacarVisitante.text = "$golVisitante"

        btGolCasa.setOnClickListener {
            golCasa++
            tvPlacarCasa.text = "$golCasa"
        }

        btGolVisitante.setOnClickListener {
            golVisitante++
            tvPlacarVisitante.text = "$golVisitante"
        }

    }
}
