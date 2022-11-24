package eif.viko.books_feature.domain.use_case

import eif.viko.books_feature.domain.repository.BooksRepository

class DeleteBook(
    private val repo: BooksRepository
) {
    suspend operator fun invoke(bookId: String) = repo.deleteBookFromFirestore(bookId)
}