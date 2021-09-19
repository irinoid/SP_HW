package lesson8;

public class Book {
    String name;
    int publishingYear;
    Author authorName;

    public Book(String name, Author authorName, int publishingYear) {
        this.name = name;
        this.authorName = authorName;
        this.publishingYear = publishingYear;

    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
