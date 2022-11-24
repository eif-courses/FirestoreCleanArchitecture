package eif.viko.books_feature.domain.use_case

import eif.viko.books_feature.domain.repository.BooksRepository

class GetBooks (
    private val repo: BooksRepository
) {
    operator fun invoke() = repo.getBooksFromFirestore()
}