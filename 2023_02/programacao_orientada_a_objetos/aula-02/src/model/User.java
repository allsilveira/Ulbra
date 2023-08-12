package model;

public class User {
    private String name;
    private int id;

    public User (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Nome: " + this.name;
    }
}
