package com.example.demo;

import java.util.List;

public interface BookService {
    Book createBook(BookRequest newBook);
    List<Book> getAllBooks();
    Book getBookById(Long id) ;
    Book borrowBook(Long id) ;
    Book returnBook(Long id) ;
    void deleteBook(Long id) ;

}
