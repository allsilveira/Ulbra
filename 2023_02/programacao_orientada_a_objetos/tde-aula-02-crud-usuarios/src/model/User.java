package model;

public class User {
    private int id;
    private String name;
    
    public User (String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString () {
        return this.id + ": " + this.name;
    }
}
