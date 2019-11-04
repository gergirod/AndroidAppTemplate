package ger.girod.apptemplate.ui.injection.module

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import girod.german.kotlinapp.data.injection.ViewModelFactory
import javax.inject.Singleton

@Module
object ViewModelModule {

    @Provides
    @Singleton internal fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory {
        return factory
    }
}