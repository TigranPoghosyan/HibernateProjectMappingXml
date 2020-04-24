package entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Employee {

        private Long id;
        private String first_Name;
        private String last_name;
        private Date birthday;
        private Address address;
        private Set<Project> projectSet;


        public Employee(){}


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_Name='" + first_Name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Project> getProjectSet() {
        return projectSet;
    }

    public void setProjectSet(Set<Project> projectSet) {
        this.projectSet = projectSet;
    }
}
