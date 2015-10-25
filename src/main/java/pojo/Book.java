package pojo;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Ujitha on 10/25/2015.
 */
public class Book {
    String iD;
    String title;
    String description;
    String image;
    String isbn;
    String subtitle;

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

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Image")
    public String getImage() {
        return image;
    }

    @JsonProperty("Image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("isbn")
    public String getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("SubTitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("SubTitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
