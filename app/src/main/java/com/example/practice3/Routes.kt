package com.example.practice3

sealed class Routes (val route: String) {
    object Welcome : Routes("ScreenBookList")
    object book : Routes("book_detail")
}