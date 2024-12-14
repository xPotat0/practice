package com.example.practice3

import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.practice3.ViewModel.BookModelView

@Composable
fun ScreenBookItem(bookId: Int, navController: NavController, viewModel: BookModelView = viewModel()) {
    val book = viewModel.bookList.first { it.id == bookId }

        Column(modifier = Modifier.padding(16.dp)) {
            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier.padding(8.dp),
            ) {
                Text(
                    text = "Назад"
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            if(book != null) {
                Text(
                    text = book.name,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(text = book.description)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Страницы: ${book.pages}")
                Spacer(modifier = Modifier.height(24.dp))
                Text(text = "Автор: ${book.author}")
            }
            else
            {
                Text(text = "Книга не найдена")
            }
        }
}