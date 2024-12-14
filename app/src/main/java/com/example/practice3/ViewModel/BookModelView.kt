package com.example.practice3.ViewModel

import androidx.lifecycle.ViewModel
import com.example.practice3.Model.Book

class BookModelView: ViewModel() {
    private val _bookList = mutableListOf<Book>()

    val bookList: List<Book>
        get() = _bookList

    init {
        _bookList.addAll(
            listOf(
                Book(
                    1,
                    "The Solar war",
                    "URL",
                    "John French",
                    "After seven years of bitter war, the end has come at last for the conflict known infamously as the Horus Heresy...",
                    384
                ),
                Book(
                    2,
                    "The Lost and the Damned",
                    "URL",
                    "Guy Haley",
                    "On the thirteenth day of Secundus, the bombardment of Terra began...",
                    416
                ),
                Book(
                    3,
                    "The First Wall",
                    "URL",
                    "Gav Thorpe",
                    "The war for the fate of mankind blazes on...",
                    460
                )
            )
        )
    }
}