package entity;

import com.mysql.cj.protocol.FullReadInputStream;
import embed.Fullname;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//(name ="Students")
//@Table(name ="Students")
public class Student {
    @Id
    private int  id;
    private Fullname name;
    private   String address;

    public Student(int id, Fullname name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fullname getName() {
        return name;
    }

    public void setName(Fullname name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
