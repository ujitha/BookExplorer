package pojo;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by Ujitha on 10/25/2015.
 */
public class BookSearch {

    String errorCode;
    String time;
    String total;
    String page;
    List<Book> bookList;

    @JsonProperty("Error")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("Error")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("Total")
    public String getTotal() {
        return total;
    }

    @JsonProperty("Total")
    public void setTotal(String total) {
        this.total = total;
    }

    @JsonProperty("Page")
    public String getPage() {
        return page;
    }

    @JsonProperty("Page")
    public void setPage(String page) {
        this.page = page;
    }

    @JsonProperty("Books")
    public List<Book> getBookList() {
        return bookList;
    }

    @JsonProperty("Books")
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
