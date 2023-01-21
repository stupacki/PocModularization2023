package com.festivalfellow.mobile.navigation.main

import androidx.navigation.NamedNavArgument

interface NavigationStep {

    val arguments: List<NamedNavArgument>

    val destination: String
}
