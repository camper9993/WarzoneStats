package com.example.warzonestats.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(
        app: Application
    ): SharedPreferences {
        return app.getSharedPreferences("shared_pref", Context.MODE_PRIVATE)
    }

//    @Provides
//    @Singleton
//    fun providePreferences(sharedPreferences: SharedPreferences): Preferences {
//        return DefaultPreferences(sharedPreferences)
//    }

//    @Provides
//    @Singleton
//    fun provideFilterOutDigitsUseCase(): FilterOutDigits {
//        return FilterOutDigits()
//    }
}