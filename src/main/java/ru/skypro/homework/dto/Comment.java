package ru.skypro.homework.dto;

public class Comment {

    int author;
    String authorImage;
    String authorFirstName;
    int createAd;
    int pk;
    String text;

    public Comment(int author, String authorImage, String authorFirstName, int createAd, int pk, String text) {
        this.author = author;
        this.authorImage = authorImage;
        this.authorFirstName = authorFirstName;
        this.createAd = createAd;
        this.pk = pk;
        this.text = text;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(String authorImage) {
        this.authorImage = authorImage;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public int getCreateAd() {
        return createAd;
    }

    public void setCreateAd(int createAd) {
        this.createAd = createAd;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
