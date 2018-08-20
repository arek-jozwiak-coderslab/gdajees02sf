package pl.coderslab.hib.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @ResponseBody
    @RequestMapping("/book/add")
    public String addBook() {

        Book book = new Book();
        book.setTitle("Thinking in Java");

        bookService.saveBook(book);
        return "-- added --";
    }
    @ResponseBody
    @RequestMapping("/book/find")
    public String findBook() {
        Book book =    bookService.findById(1L);

        book.getAuthor();

        return "::: "+ book.toString();
    }
    @ResponseBody
    @RequestMapping("/book/update")
    public String updateBook() {
        Book book =    bookService.findById(1L);
        book.setTitle("New Title");
        bookService.update(book);
        return "::: "+ book.toString();
    }

    @ResponseBody
    @RequestMapping("/book/delete")
    public String removeBook() {
        Book book =    bookService.findById(1L);
        bookService.delete(book);
        return " deleted ";
    }
}
