package domain;

import buisnessLogic.HibernateUtill;
import entity.Address;
import entity.Employee;
import entity.Project;
import org.hibernate.Session;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Domain {
    public static void main(String[] args) {

        Session session = HibernateUtill.getSessionFactory().openSession();
        session.beginTransaction();

        Address address = new Address();
        address.setCountry("FRA");
        address.setCity("Lille");
        address.setStreet("La France de pari");
        address.setPost_code("54321");

        Employee employee = new Employee();
        employee.setFirst_Name("Kilian");
        employee.setLast_name("Mbape");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,Calendar.AUGUST,8);

        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Project project = new Project();
        project.setTitle("987654");

        Set<Project> projects = new HashSet<Project>();
        projects.add(project);
        employee.setProjectSet(projects);

        session.save(address);
        session.save(employee);
        session.save(project);

        session.getTransaction().commit();
        HibernateUtill.shutDown();

    }
}
