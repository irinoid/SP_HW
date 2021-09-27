package lesson9;
import java.util.Objects;
public class Book {
    String name;
    int publishingYear;
    Author authorName;

    public Book(String name, Author authorName, int publishingYear){
        this.name = name;
        this.authorName = authorName;
        this.publishingYear = publishingYear;

    }
    public String getName(){
        return name;
    }
    public Author getAuthorName(){
        return authorName;
    }
    public int getPublishingYear(){
        return publishingYear;
    }
    public void setPublishingYear (int publishingYear){
        this.publishingYear = publishingYear;
    }
    public String toString(){
        return name + ": "+ authorName+": "+ publishingYear;
    }
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name);
    }
    public int hashCode(){
        return Objects.hash(name);
    }
}
