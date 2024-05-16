package com.example.jetpackcompose.ui.theme.dependency_injection.myInterface

import androidx.core.app.ActivityCompat
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule {

    @ActivityScoped
    @Binds
    abstract fun bindingInterface(colorImplementor : ColorImplementor) : ColorInterface
}