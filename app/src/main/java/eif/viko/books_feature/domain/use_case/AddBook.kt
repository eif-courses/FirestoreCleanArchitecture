package eif.viko.books_feature.domain.use_case

import eif.viko.books_feature.domain.repository.BooksRepository

class AddBook(
    private val repo: BooksRepository
) {
    suspend operator fun invoke(
        title: String,
        author: String
    ) = repo.addBookToFirestore(title, author)
}