package ru.spb.yakovlev.movieapp2020.di.modules

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import ru.spb.yakovlev.movieapp2020.R
import ru.spb.yakovlev.movieapp2020.model.Locale
import ru.spb.yakovlev.movieapp2020.ui.RootActivity
import timber.log.Timber

@InstallIn(ActivityComponent::class)
@Module
class ActivityModule {
    @Provides
    fun providesLanguage(
        activity: RootActivity
    ): Locale = Locale(
        name = activity.resources.getString(R.string.app_locale),
        country = activity.resources.getString(R.string.app_default_location),
    ).also { Timber.tag("123456789").d("Locale name = ${it.name}") }

    @Provides
    fun providesActivity(
        activity: Activity
    ): RootActivity = activity as RootActivity
}