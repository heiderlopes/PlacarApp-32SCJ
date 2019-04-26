package br.com.fiap.placarapp.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()