package com.example.practice3.ViewModel

import androidx.lifecycle.ViewModel
import com.example.practice3.Model.Book

class BookModel(private val book: Book) : ViewModel() {
    val name: String
        get() = book.name
}