package pojo;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Ujitha on 10/25/2015.
 */
public class BookDetail {

    String errorCode;
    String time;
    String iD;
    String title;
    String subtitle;
    String description;
    String author;
    String isbn;
    String page;
    String year;
    String publisher;
    String imageUrl;
    String downloadUrl;

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

    @JsonProperty("ID")
    public String getiD() {
        return iD;
    }

    @JsonProperty("ID")
    public void setiD(String iD) {
        this.iD = iD;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("SubTitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("SubTitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("Author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("ISBN")
    public String getIsbn() {
        return isbn;
    }

    @JsonProperty("ISBN")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("Page")
    public String getPage() {
        return page;
    }

    @JsonProperty("Page")
    public void setPage(String page) {
        this.page = page;
    }

    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    @JsonProperty("Year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("Publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("Publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("Image")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("Image")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("Download")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("Download")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

}
