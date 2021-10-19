package se.lexicon.model;

public class ContactInfo {
    private String id;
    private String email;
    private String phone;

    public ContactInfo(String id, String email, String phone){
        this.id=id;
        this.email=email;
        this.phone=phone;
    }

    public ContactInfo(String email, String phone){
        this.email=email;
        this.phone=phone;
    }

    public void setId(String id) {    }
    public void setEmail(String email){ this.email=email;  }
    public void setPhone(String phone){ this.phone=phone; }


    public String getId() {   return id;   }
    public String getEmail() {  return email;   }
    public String getPhone() {  return phone;   }
 }

 //id : String
//email : String
//phone : String