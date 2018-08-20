package pl.coderslab.hib.day1;


import org.springframework.stereotype.Service;
import pl.coderslab.hib.day1.dao.BookDao;

@Service
public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void saveBook(Book book){
        bookDao.saveBook(book);
    }

    public Book findById(long id) {
        return bookDao.findById(id);
    }

    public void delete(Book entity) {
        bookDao.delete(entity);
    }

}
