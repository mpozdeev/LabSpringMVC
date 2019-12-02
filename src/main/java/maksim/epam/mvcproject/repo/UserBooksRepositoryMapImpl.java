package maksim.epam.mvcproject.repo;

import maksim.epam.mvcproject.model.Book;
import maksim.epam.mvcproject.model.User;

import java.util.List;
import java.util.Map;

public class UserBooksRepositoryMapImpl implements UsersBooksRepository {

    private Map<Long, List<Book>> archive;

    @Override
    public long createBooksList(User user, List<Book> bookList) {
        archive.put(user.getId(), bookList);
        return user.getId();
    }

    @Override
    public List<Book> getBooksList(User user) {
        return archive.get(user.getId());
    }

    @Override
    public long deleteBooksList(User user) {
        long result = -1L;
        result = user.getId();
        archive.remove(user.getId());
        return result;
    }

    public int setArchive(Map<Long, List<Book>> listMap) {
        this.archive = listMap;
        return listMap.size();
    }
}
