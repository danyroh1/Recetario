package com.example.recetas.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.recetas.views.*

@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainMenu"){
        composable("mainMenu"){
            MainMenuView(navController)
        }
        composable("Cochinita"){
            CochinitaPibilView(navController)
        }
        composable("Dumplings"){
            DumplingsView(navController)
        }
        composable("Pizza"){
            PizzaView(navController)
        }
        composable("Sushi"){
            SushiView(navController)
        }
    }
}
