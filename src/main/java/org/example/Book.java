package org.example;

// Класс Book
public class Book {
    private Author author;
    private String title;
    private int publicationYear;

    // Конструктор
    public Book(Author author,String title,  int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    // Геттеры
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    // Сеттер для года публикации
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

