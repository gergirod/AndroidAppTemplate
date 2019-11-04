package ger.girod.apptemplate.data.injection.component

import dagger.Component
import ger.girod.apptemplate.data.injection.module.NetworkModule
import ger.girod.apptemplate.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkModuleInjector {

    fun inject(mainActivity: MainActivity)

}