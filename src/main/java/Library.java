import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Library {

    @JsonProperty("books")
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                '}';
    }
}
