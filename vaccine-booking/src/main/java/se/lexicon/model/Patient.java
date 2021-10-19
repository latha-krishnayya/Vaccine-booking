package se.lexicon.model;

import java.time.LocalDate;

public class Patient {

    private String id;
    private String ssn;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

//Constructors
    public Patient(String id, String ssn, String firstName, String lastName, LocalDate birthDate){
        this.id=id;
        this.ssn=ssn;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
    }
    public Patient(String ssn, String firstName, String lastName, LocalDate birthDate){
        this.ssn=ssn;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
    }
//Setters
    public void setId(String id) {   this.id = id;  }
    public void setSsn(String ssn) {  this.ssn = ssn;   }
    public void setFirstName(String firstName) { this.firstName = firstName;   }
    public void setLastName(String lastName) { this.lastName = lastName;  }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate;   }

//Getters
    public String getId() {   return id;   }
    public String getSsn() {  return ssn;   }
    public String getFirstName() { return firstName;  }
    public String getLastName() { return lastName;  }
    public LocalDate getBirthDate() {  return birthDate;  }

}






//id : String
//ssn : String
//firstName : String
//lastName : String
//birthDate : LocalDate