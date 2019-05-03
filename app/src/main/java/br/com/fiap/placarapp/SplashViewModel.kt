package br.com.fiap.placarapp

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.os.Handler

class SplashViewModel: ViewModel() {

    var loading: MutableLiveData<Boolean> = MutableLiveData()

    init {
        loading.value = true
    }

    fun load() {
        Handler().postDelayed({
            loading.value = false
        }, 3000)
    }
}