package org.example;

// Класс Book
public class Book {
    private Author author;
    private String title;
    private int publicationYear;

    // Переопределяем метод toString
    public String toString() {
        return "Автор - " + author.toString() + " Наименование произведения - " + title + " Год публикации - " + publicationYear;
    }

    // Переопределяем метод equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return publicationYear == book.publicationYear &&
                title.equals(book.title) &&
                author.equals(book.author);
    }
    // Переопределяем метод hashCode
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }
    // Конструктор
    public Book(Author author, String title, int publicationYear) {
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

