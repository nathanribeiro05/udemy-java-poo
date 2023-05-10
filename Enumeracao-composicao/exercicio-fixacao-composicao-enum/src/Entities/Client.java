package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String clientName;
    private String email;
    private Date birthDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Client(String clientName, String email, Date birthDate) {
        this.clientName = clientName;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return clientName + " (" + sdf.format(birthDate) + ") - " + email;
    }
   
    
}
