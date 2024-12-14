package com.example.practice3

import android.graphics.Paint.Align
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.practice3.ViewModel.BookModelView

@Composable
fun ScreenBookList(onBookClick: (Int) -> Unit) {
    val viewModel: BookModelView = viewModel()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(viewModel.bookList) {
            Book -> ListItem(
                modifier = Modifier
                    .clickable { onBookClick(Book.id) }
                    .padding(8.dp),
                headlineContent = {
                    Row (
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) { Text(Book.name, style = MaterialTheme.typography.titleLarge)}
                }
            )
        }
    }
}