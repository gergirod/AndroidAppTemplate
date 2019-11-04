package ger.girod.apptemplate.ui.injection.component

import dagger.Component
import ger.girod.apptemplate.ui.MainActivity
import ger.girod.apptemplate.ui.MainActivityViewModel
import ger.girod.apptemplate.ui.injection.module.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelModule::class])
interface ViewModelInjector {

    fun inject(mainActivityViewModel: MainActivityViewModel)

}