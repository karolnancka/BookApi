package pl.coderslab.service;
import pl.coderslab.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();
    void add(Book book);
}
