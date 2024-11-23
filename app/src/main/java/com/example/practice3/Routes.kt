package com.example.practice3

sealed class Routes (val route: String) {
    object Welcome : Routes("Welcome")
}