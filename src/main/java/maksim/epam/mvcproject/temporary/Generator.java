package maksim.epam.mvcproject.temporary;

import maksim.epam.mvcproject.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    private static long count = 0;

    public static List<Book> generateBooks(int countBooks){
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < countBooks; i++) {
            books.add(generateBook());
        }
        return books;
    }

    private static Book generateBook(){
        Book book = new Book();
        int d = (int)(1900 + Math.random()*120);
        String title = "Title_" + d;
        String author = "Author_" + d;

        book.setId(++count);
        book.setBookTitle(title);
        book.setAuthor(author);
        book.setReleaseYear(d);
        book.setDescription("Description: The " + title + " was writing " + d + " by "+ author);
        return book;
    }

}
