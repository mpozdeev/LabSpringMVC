package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.Book;
import maksim.epam.mvcproject.model.User;

import java.util.List;

public interface UsersBooksRepository {

    long createBooksList(User user, List<Book> bookList);

    List<Book> getBooksList(User user);

//    Update ????????????

    long deleteBooksList(User user);

}
