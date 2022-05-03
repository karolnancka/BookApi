package pl.coderslab.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;
import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;
import pl.coderslab.service.MockBookService;


import java.util.List;


@Controller
@RequestMapping("/books")
public class BookController {

    private BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("")
    @ResponseBody
    public List<Book> getList() {
        return this.bookService.getBooks();
    }

    @GetMapping("/add")
    public String addBook() {
        return "addForm";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(@RequestParam String isbn, @RequestParam String title, @RequestParam String author,
                    @RequestParam String publisher, @RequestParam String type){

        Book newBook = new Book(0L, isbn, title, author, publisher, type);
        bookService.add(newBook);

        return "book added";

    }






    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }



}


