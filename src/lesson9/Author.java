package lesson9;

import java.util.Objects;

public class Author {
    private final String authorFirstName;
    private final String authorSecondName;

    public Author(String authorFirstName, String authorSecondName){
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }
    public String getAuthorFirstName(){
        return authorFirstName;
    }
    public String getAuthorSecondName(){
        return authorSecondName;
    }
    public String toString(){
        return authorFirstName +" "+ authorSecondName;
    }
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        }
        Author authorName1 = (Author) other;
        return authorFirstName.equals(authorName1.authorFirstName)&&authorSecondName.equals(authorName1.authorSecondName);
    }
    public int hashCode(){
        return Objects.hash(authorFirstName, authorSecondName);
    }

}
