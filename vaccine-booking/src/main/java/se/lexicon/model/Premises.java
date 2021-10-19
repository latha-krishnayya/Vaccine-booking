package se.lexicon.model;

public class Premises {

//Class
    private String id;
    private String name;

//Constructor
    public Premises(String id, String name) {
        this.id = id;
        this.name = name;
    }

//Setters
    public void setId(String id) {  this.id = id;   }
    public void setName(String name) {  this.name = name;   }

//Getters
    public String getId() {  return id;   }
    public String getName() {   return name;   }
}
