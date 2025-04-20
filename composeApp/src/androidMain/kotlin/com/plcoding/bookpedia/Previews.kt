package com.plcoding.bookpedia

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
private fun BookSearchBarPreview() {
    BookSearchBar(
        searchQuery = "Kotlin",
        onSearchQueryChange = {},
        onImeSearch = {},
        modifier = Modifier.fillMaxWidth()
    )
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://example.com/book$it.jpg",
        authors = listOf("Fauzan Radji"),
        description = "This is a description of book $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.567,
        ratingCount = 100,
        numPages = 100,
        numEditions = 10
    )
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(searchResults = books),
        onAction = {}
    )
}