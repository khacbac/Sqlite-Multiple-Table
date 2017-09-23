package com.example.doanlv4.sqlitemutipletable;

/**
 * Created by doanLV4 on 9/23/2017.
 */

public class Todo {
    int id;
    String note;
    int status;
    String created_at;
    String themCot3;

    // constructors
    public Todo() {
    }

    public Todo(String note, int status) {
        this.note = note;
        this.status = status;
    }

    public Todo(int id, String note, int status) {
        this.id = id;
        this.note = note;
        this.status = status;
    }

    public Todo(int id, String note, int status, String created_at, String themCot3) {
        this.id = id;
        this.note = note;
        this.status = status;
        this.created_at = created_at;
        this.themCot3 = themCot3;
    }

    public Todo(String note, int status, String created_at, String themCot3) {
        this.note = note;
        this.status = status;
        this.created_at = created_at;
        this.themCot3 = themCot3;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreatedAt(String created_at){
        this.created_at = created_at;
    }

    // getters
    public long getId() {
        return this.id;
    }

    public String getNote() {
        return this.note;
    }

    public int getStatus() {
        return this.status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getThemCot3() {
        return themCot3;
    }

    public void setThemCot3(String themCot3) {
        this.themCot3 = themCot3;
    }
}
