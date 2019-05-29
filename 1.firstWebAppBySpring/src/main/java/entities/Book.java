package entities;

import java.util.Objects;

public class Book {
    private int id;
    private String writer;
    private String title;

    public Book() {
    }

    public Book(int id, String writer, String title) {
        this.id = id;
        this.writer = writer;
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() &&
                getWriter().equals(book.getWriter()) &&
                getTitle().equals(book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWriter(), getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
