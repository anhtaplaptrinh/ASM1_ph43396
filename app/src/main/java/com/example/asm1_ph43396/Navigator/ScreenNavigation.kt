package com.example.asm1_ph43396.Navigator

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.asm1_ph43396.Screens.Authen.LoginScreen
import com.example.asm1_ph43396.Screens.Screen
import com.example.asm1_ph43396.Screens.Authen.SignUpScreen
import com.example.asm1_ph43396.Screens.CartScreen
import com.example.asm1_ph43396.Screens.CheckOut
import com.example.asm1_ph43396.Screens.CongratScreen
import com.example.asm1_ph43396.Screens.DetailProduct
import com.example.asm1_ph43396.Screens.HomeScreen
import com.example.asm1_ph43396.Screens.WelcomeScreen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.WelcomeScreen.route,
    ) {
        composable(Screen.WelcomeScreen.route) { WelcomeScreen(navController) }
        composable(Screen.LoginScreen.route) { LoginScreen(navController) }
        composable(Screen.SignUpScreen.route) { SignUpScreen(navController) }
        composable(Screen.HomeScreen.route) { HomeScreen(navController) }
        composable(Screen.DetailProduct.route) { DetailProduct(navController) }
        composable(Screen.CongratScreen.route) { CongratScreen(navController) }
        composable(Screen.CartScreen.route) { CartScreen(navController) }
        composable(Screen.CheckOut.route) { CheckOut(navController) }
    }
}