package eif.viko.books_feature.presentation.books.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import eif.viko.books_feature.core.Constants.DELETE_BOOK

@Composable
fun DeleteIcon(
    deleteBook: () -> Unit
) {
    IconButton(
        onClick = deleteBook
    ) {
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = DELETE_BOOK,
        )
    }
}