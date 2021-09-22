package lesson9;

public class Lesson9 {
    public static void main(String[] args) {
        Author authorName1 = new Author("Джоан Кейтлин","Роулинг");
        Author authorName2 = new Author("Теодор","Драйзер");
        Author authorName3 = new Author("Джоан Кейтлин","Иванова");
        Author authorName4 = new Author("Джоан Кейтлин","Роулинг");
        Book book1 = new Book("Гарри Поттер", authorName1, 1998);
        Book book2 = new Book("Сестра Кэрри", authorName2, 2021);
        Book book3 = new Book("Гарри Поттер", authorName1, 1998);
        //System.out.println("Книга1 - '"+book1.getName() + "' автор - " + authorName1.getAuthorFirstName() +" "+ authorName1.getAuthorSecondName()+ "; год выпуска -  " + book1.getPublishingYear());
        //System.out.println("Книга2 - '"+book2.getName() + "' автор - " + authorName2.getAuthorFirstName() +" "+ authorName2.getAuthorSecondName()+ "; год выпуска -  " + book2.getPublishingYear());
        System.out.println (book1);
        //book1.setPublishingYear(1956);
        //System.out.println("Новый год издания - "+ book1.getPublishingYear());
        System.out.println(book1.equals(book3));
        System.out.println(authorName1.equals(authorName4));
        System.out.println(authorName1.equals(authorName3));
        System.out.println("Сравнение авторов по хэш-коду: " + (authorName1.hashCode() == authorName2.hashCode()));
        System.out.println("Сравнение авторов по хэш-коду: " + (authorName1.hashCode() == authorName4.hashCode()));
        System.out.println("Сравнение названий книг по хэш-коду: " + (book1.hashCode() == book2.hashCode()));
    }

}
