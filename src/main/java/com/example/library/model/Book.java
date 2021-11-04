package com.example.library.model;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "total_pages")
    private int total_pages;

    @Column(name = "published_date")
    private LocalDate published_date;

    @Column(name = "count_of_copies")
    private int count_of_copies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public LocalDate getPublished_date() {
        return published_date;
    }

    public void setPublished_date(LocalDate published_date) {
        this.published_date = published_date;
    }

    public int getCount_of_copies() {
        return count_of_copies;
    }

    public void setCount_of_copies(int count_of_copies) {
        this.count_of_copies = count_of_copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", total_pages=" + total_pages +
                ", published_date=" + published_date +
                ", count_of_copies=" + count_of_copies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && total_pages == book.total_pages && count_of_copies == book.count_of_copies && Objects.equals(title, book.title) && Objects.equals(published_date, book.published_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, total_pages, published_date, count_of_copies);
    }
}
