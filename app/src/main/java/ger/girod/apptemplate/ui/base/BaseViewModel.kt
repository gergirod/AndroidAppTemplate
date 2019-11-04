package ger.girod.apptemplate.ui.base

import androidx.lifecycle.ViewModel
import ger.girod.apptemplate.ui.MainActivityViewModel
import ger.girod.apptemplate.ui.injection.component.DaggerViewModelInjector
import ger.girod.apptemplate.ui.injection.component.ViewModelInjector
import ger.girod.apptemplate.ui.injection.module.ViewModelModule

abstract class BaseViewModel : ViewModel() {

    private val injector2: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .viewModelModule(ViewModelModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when(this) {
            is MainActivityViewModel -> injector2.inject(this)
        }
    }

}