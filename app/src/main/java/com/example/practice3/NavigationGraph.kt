package com.example.practice3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController, onBottomBarVisibilityChanged: (Boolean) -> Unit) {
    NavHost(navController, startDestination = Routes.Welcome.route) {

        composable(BottomNavigationItems.ScreenBookList.route) {
            onBottomBarVisibilityChanged(true)
            ScreenBookList{ bookId -> navController.navigate("book_detail/${bookId}") }
        }
        composable(BottomNavigationItems.ScreenBookItem.route) {
            backStackEntry ->
            val bookId = backStackEntry.arguments?.getString("bookId")?.toInt() ?: 1
            onBottomBarVisibilityChanged(false)
            ScreenBookItem(bookId, navController)
        }
        composable(BottomNavigationItems.Screen2.route) {
            onBottomBarVisibilityChanged(true)
            Screen2()
        }
        composable(BottomNavigationItems.Screen3.route) {
            onBottomBarVisibilityChanged(true)
            Screen3()
        }
    }
}