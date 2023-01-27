package com.festivalfellow.mobile.app.injection

import com.festivalfellow.mobile.app.view.composable.SecondScreen
import com.festivalfellow.mobile.app.view.composable.StartScreen
import com.festivalfellow.mobile.navigation.main.NavigationStep
import com.festivalfellow.mobile.navigation.main.SecondScreenStep
import com.festivalfellow.mobile.navigation.main.StartScreenStep
import org.koin.core.component.KoinComponent
import org.koin.core.module.Module
import org.koin.core.qualifier.StringQualifier
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal class AppComponent : KoinComponent {

    companion object {

        val NAVIGATION_STEPS_QUALIFIER: StringQualifier = named("navigationSteps")
    }
}

fun appModule(): Module = module {

    single<List<NavigationStep>>(AppComponent.NAVIGATION_STEPS_QUALIFIER) {
        listOf(
            StartScreenStep(
                arguments = listOf(),
                content = { navController, backStackEntry ->
                    StartScreen(
                        navController,
                        backStackEntry,
                    )
                },
            ),
            SecondScreenStep(
                arguments = listOf(),
                content = { navController, backStackEntry ->
                    SecondScreen(
                        navController,
                        backStackEntry,
                    )
                },
            )
        )
    }
}