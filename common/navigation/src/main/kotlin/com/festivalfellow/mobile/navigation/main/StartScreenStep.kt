package com.festivalfellow.mobile.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

class StartScreenStep(
    override val arguments: List<NamedNavArgument>,
    override val content: @Composable (NavController, NavBackStackEntry) -> Unit,
) : NavigationStep {

    override val isStartDestination: Boolean
        get() = true

    override val destination: String
        get() = START_SCREEN

    companion object {
        const val START_SCREEN = "startScreen"
    }
}