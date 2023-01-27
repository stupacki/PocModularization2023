package com.festivalfellow.mobile.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController

class SecondScreenStep(
    override val arguments: List<NamedNavArgument>,
    override val content: @Composable (NavController, NavBackStackEntry) -> Unit,
) : NavigationStep {

    override val isStartDestination: Boolean
        get() = false

    override val destination: String
        get() = SECOND_SCREEN

    companion object {
        const val SECOND_SCREEN = "secondScreen"
    }
}
