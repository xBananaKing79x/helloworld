package org.example;

public class App {
    public static void main(String[] args) {
        // Создаем объекты Author
        Author author1 = new Author ("Лев","Толстой");
        Author author2 = new Author ("Федор", "Достоевский");

        // Создаем объекты Book
        Book book1 = new Book (author1, "Война и мир", 1869);
        Book book2 = new Book(author2,"Преступление и наказание", 1866);
        System.out.println(author1.getFirstName());
        // Выводим информацию о книгах
        System.out.println("Книга 1:");
        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() );
        System.out.println("Год публикации: " + book1.getPublicationYear());

        System.out.println("Книга 2:");
        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() );
        System.out.println("Год публикации: " + book2.getPublicationYear());

        // Изменяем год публикации первой книги
        book1.setPublicationYear(1870);
        System.out.println("Измененный год публикации книги 1: " + book1.getPublicationYear());

        // Проверяем equals и hashCode
        Book book3 = new Book(author1, "Война и мир", 1870);
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // true
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
    }
}
