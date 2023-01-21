package com.festivalfellow.mobile.navigation.settings

import androidx.navigation.NamedNavArgument
import com.festivalfellow.mobile.navigation.main.NavigationStep

object SettingsNavigation {

    private const val APP_SETTINGS_ID = "appSettings"

    fun start(arguments: List<NamedNavArgument> = emptyList<NamedNavArgument>()) =
        object : NavigationStep {

            override val arguments = arguments

            override val destination = APP_SETTINGS_ID
        }
}
