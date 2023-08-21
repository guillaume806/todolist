package org.example.entity;



import javax.persistence.*;


@Entity

public class Todolist {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private boolean completed;

    public Todolist() {
    }

    public Todolist(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
