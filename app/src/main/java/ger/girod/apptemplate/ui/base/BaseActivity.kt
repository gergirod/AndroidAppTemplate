package ger.girod.apptemplate.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ger.girod.apptemplate.data.injection.component.DaggerNetworkModuleInjector
import ger.girod.apptemplate.data.injection.component.NetworkModuleInjector
import ger.girod.apptemplate.data.injection.module.NetworkModule
import ger.girod.apptemplate.ui.MainActivity
import ger.girod.apptemplate.ui.injection.component.DaggerViewModelInjector
import ger.girod.apptemplate.ui.injection.component.ViewModelInjector
import ger.girod.apptemplate.ui.injection.module.ViewModelModule

abstract class BaseActivity : AppCompatActivity() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .viewModelModule(ViewModelModule)
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
    }


    private fun inject() {
        when(this) {
            is MainActivity -> injector.inject(this)
        }

    }

}