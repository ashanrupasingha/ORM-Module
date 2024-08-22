package embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class Fullname {

    private String fristName;

    private String lastName;

    public Fullname(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public Fullname() {
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
