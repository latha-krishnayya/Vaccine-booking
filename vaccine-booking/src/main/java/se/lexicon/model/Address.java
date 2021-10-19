package se.lexicon.model;

import java.time.LocalDate;

//Class
public class Address{
    private String id;
    private String streetAddress;
    private String zipCode;
    private String city;

//Constructor
    public Address(String id, String streetAddress, String zipCode, String city) {
        this.id = id;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.city = city;
    }

//Setter
    public void setId(String id) {    this.id = id;   }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress;  }
    public void setZipCode(String zipCode) {  this.zipCode = zipCode;  }
    public void setCity(String city) {  this.city = city;  }

//Getters
    public String getId() {  return id;   }
    public String getStreetAddress() {   return streetAddress;   }
    public String getZipCode() {   return zipCode;    }
    public String getCity() {   return city;   }
}
//id : String
//streetAddress : String
//zipCode : String
//city : String