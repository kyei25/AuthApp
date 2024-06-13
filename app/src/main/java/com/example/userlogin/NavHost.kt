package com.example.userlogin

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navigateToSignUpScreen = {
                navController.navigate("signUp")
            })
        }
        composable("signUp") {
            SignUpScreen(navigateToLoginScreen = {
                navController.navigate("login")
            })
        }
    }
}