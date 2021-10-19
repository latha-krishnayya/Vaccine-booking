package se.lexicon.model;

import java.time.LocalDate;

//class
public class Booking {
    private String id;
    private String administrator;
    private String vaccineId;
    private boolean vacant;
    private LocalDate dateTime;

//Constructor
    public Booking(String id, String administrator, String vaccineId, boolean vacant, LocalDate dateTime) {
        this.id = id;
        this.administrator = administrator;
        this.vaccineId = vaccineId;
        this.vacant = vacant;
        this.dateTime = dateTime;
    }

//Setters
    public void setId(String id) {   this.id = id;   }
    public void setAdministrator(String administrator) { this.administrator = administrator;   }
    public void setVaccineId(String vaccineId) { this.vaccineId = vaccineId;   }
    public void setVacant(boolean vacant) {   this.vacant = vacant;   }
    public void setDateTime(LocalDate dateTime) { this.dateTime = dateTime;  }

//Getters
    public String getId() {   return id;  }
    public String getAdministrator() { return administrator; }
    public String getVaccineId() { return vaccineId;    }
    public boolean isVacant() { return vacant;  }
    public LocalDate getDateTime() {  return dateTime;    }
}
