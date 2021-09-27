package lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        Author authorName1 = new Author("Дж.К.Роулинг");
        Author authorName2 = new Author("Т.Драйзер");
        Book book1 = new Book("Гарри Поттер", authorName1, 1998);
        Book book2 = new Book("Сестра Кэрри", authorName2, 2021);

        System.out.println("Книга1 - '"+book1.getName() + "' автор - " + authorName1.getAuthorName() + "; год выпуска -  " + book1.getPublishingYear());
        System.out.println("Книга2 - '"+book2.getName() + "' автор - " + authorName2.getAuthorName() + "; год выпуска -  " + book2.getPublishingYear());

        book1.setPublishingYear(1956);
        System.out.println("Новый год издания - "+ book1.getPublishingYear());


    }
}
