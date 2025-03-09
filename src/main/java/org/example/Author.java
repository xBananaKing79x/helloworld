package org.example;

//Класс Author
public class Author {
    private String firstName;
    private String lastName;
// Переопределяем метод toString
    public String toString() {
        return "Имя " + firstName + " Фамилия " + lastName;
    }
    // Переопределяем метод equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }
    // Переопределяем метод hashCode
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
    // Конструктор
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
