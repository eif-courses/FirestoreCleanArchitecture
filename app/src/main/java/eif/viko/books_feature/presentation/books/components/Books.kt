package eif.viko.books_feature.presentation.books.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import eif.viko.books_feature.components.ProgressBar
import eif.viko.books_feature.core.Utils.Companion.print
import eif.viko.books_feature.domain.model.Response.*
import eif.viko.books_feature.domain.repository.Books
import eif.viko.books_feature.presentation.books.BooksViewModel

@Composable
fun Books(
    viewModel: BooksViewModel = hiltViewModel(),
    booksContent: @Composable (books: Books) -> Unit
) {
    when(val booksResponse = viewModel.booksResponse) {
        is Loading -> ProgressBar()
        is Success -> booksContent(booksResponse.data)
        is Failure -> print(booksResponse.e)
    }
}