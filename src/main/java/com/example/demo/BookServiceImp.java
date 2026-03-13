package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(BookRequest newBook) {
        Book book = new Book();
        book.setTitle(newBook.title());
        book.setAuthor(newBook.author());
        book.setStatus("Available");
        return bookRepository.save(book);
    }
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    @Override
    public Book borrowBook(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        book.setStatus("Borrowed");
        return bookRepository.save(book);
    }
    @Override
    public Book returnBook(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        book.setStatus("Available");
        return bookRepository.save(book);
    }
    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
