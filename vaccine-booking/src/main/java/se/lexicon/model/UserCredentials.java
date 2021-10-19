package se.lexicon.model;

public class UserCredentials {

    private String id;
    private String username;
    private String password;
    private String role;

//Constructor
    public UserCredentials(String id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

//Setters
    public void setId(String id) {   this.id = id;  }
    public void setUsername(String username) { this.username = username;   }
    public void setPassword(String password) {  this.password = password;  }
    public void setRole(String role) {  this.role = role;  }

//Getters
    public String getId() { return id;   }
    public String getUsername() {  return username;  }
    public String getPassword() {   return password;  }
    public String getRole() {  return role;   }
}
