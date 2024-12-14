package com.example.practice3

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItems (
    val route: String,
    val title: String? = null,
    val icon: ImageVector? = null
) {
    object ScreenBookList : BottomNavigationItems(
        route = "ScreenBookList",
        title = "ScreenBookList",
        icon = Icons.Outlined.Home
    )

    object ScreenBookItem : BottomNavigationItems(
        route = "book_detail/{bookId}",
        title = "book_detail/{bookId}",
        icon = Icons.Outlined.Home
    )

    object Screen2 : BottomNavigationItems(
        route = "Screen2",
        title = "Screen2",
        icon = Icons.Outlined.AddCircle
    )

    object Screen3 : BottomNavigationItems(
        route = "Screen3",
        title = "Screen3",
        icon = Icons.Outlined.AccountCircle
    )
}