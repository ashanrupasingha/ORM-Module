package lk.ijse;

import embed.Fullname;
import entity.Vehicle;
import org.hibernate.Session;
import config.FactoryConfiguration;
import entity.Student;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Fullname fullname=new Fullname("ASHAN","Nuwantha");
        Student student = new Student();
        student.setId(1);
        student.setName(fullname);
        student.setAddress("Laxapana");
        Transaction transaction = session.beginTransaction();
        session.save(student);
        //delete,get,add another table,note
        transaction.commit();
        session.close();

        session.delete(student);

        //get
        Student student1 = session.get(Student.class, 1);
        System.out.println(student1.toString());
        //commit
        transaction.commit();

        //Vehicle
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();
        Vehicle vehicle = new Vehicle(2,"car","Benz",2012);
        //save
        session1.save(vehicle);

        //update
        session1.update(vehicle);

        //delete
        session1.delete(vehicle);

        //get
        Vehicle vehicle1 = session1.get(Vehicle.class, 1);
        System.out.println(vehicle1.getBrand() + ", " +vehicle1.getModel()+", "+vehicle1.getYom());
        transaction1.commit();
        session1.close();
    }
}