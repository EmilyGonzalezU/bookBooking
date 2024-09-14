package model;

public abstract class Entity {
    //General class
    private String id;

    public Entity(int id){
        this.id = String.valueOf(id);
    }

    public String getId() {
        return id;
    }

    public void setString(int id) {
        this.id = String.valueOf(id);
    }
}