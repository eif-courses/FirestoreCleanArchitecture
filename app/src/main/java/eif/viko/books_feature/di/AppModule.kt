package eif.viko.books_feature.di

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eif.viko.books_feature.core.Constants.BOOKS
import eif.viko.books_feature.data.repository.BooksRepositoryImpl
import eif.viko.books_feature.domain.repository.BooksRepository
import eif.viko.books_feature.domain.use_case.AddBook
import eif.viko.books_feature.domain.use_case.DeleteBook
import eif.viko.books_feature.domain.use_case.GetBooks
import eif.viko.books_feature.domain.use_case.UseCases
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideFirebaseFirestore() = Firebase.firestore

    @Provides
    @Singleton
    fun provideBooksRef(
        db: FirebaseFirestore
    ) = db.collection(BOOKS)

    @Provides
    @Singleton
    fun provideBooksRepository(
        booksRef: CollectionReference
    ): BooksRepository = BooksRepositoryImpl(booksRef)

    @Provides
    @Singleton
    fun provideUseCases(
        repo: BooksRepository
    ) = UseCases(
        getBooks = GetBooks(repo),
        addBook = AddBook(repo),
        deleteBook = DeleteBook(repo)
    )
}