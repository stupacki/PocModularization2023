package com.festivalfellow.mobile.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.festivalfellow.mobile.navigation.settings.SettingsNavigation
import com.festivalfellow.mobile.navigation.start.AppStartNavigation

object MainNavigation {

    val toAppStart: AppStartNavigation = AppStartNavigation

    val toSettings: SettingsNavigation = SettingsNavigation
}

@Composable
fun Navigation(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = MainNavigation.toAppStart.start().destination,
    ) {
        //navigation()
//composable()
    }
}

