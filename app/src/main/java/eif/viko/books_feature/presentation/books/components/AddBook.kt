package eif.viko.books_feature.presentation.books.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import eif.viko.books_feature.components.ProgressBar
import eif.viko.books_feature.core.Utils.Companion.print
import eif.viko.books_feature.domain.model.Response.*
import eif.viko.books_feature.presentation.books.BooksViewModel

@Composable
fun AddBook(
    viewModel: BooksViewModel = hiltViewModel()
) {
    when(val addBookResponse = viewModel.addBookResponse) {
        is Loading -> ProgressBar()
        is Success -> Unit
        is Failure -> print(addBookResponse.e)
    }
}