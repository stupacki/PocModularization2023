package com.festivalfellow.mobile.navigation.start

import androidx.navigation.NamedNavArgument
import com.festivalfellow.mobile.navigation.main.NavigationStep

object AppStartNavigation {

    private const val APP_START_ID = "appStart"

    fun start(arguments: List<NamedNavArgument> = emptyList<NamedNavArgument>()) =
        object : NavigationStep {

            override val arguments = arguments

            override val destination = APP_START_ID
        }
}
