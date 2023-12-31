package com.maksim.spring.mvc_hibernate_aop.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Size(min = 2,message = "the name field must contain at least 2 characters")
    @NotBlank(message = "the field with the name should not be empty")
    private String name;

    @Column(name = "surname")
    @Size(min = 2,message = "the surname field must contain at least 2 characters")
    @NotBlank(message = "the surname field should not be empty")
    private String surname;

    @Column(name = "department")
    @Size(min = 2,message = "the department field must contain at least 2 characters")
    @NotBlank(message = "the department field should not be empty")
    private String department;

    @Column(name = "salary")
    @Min(value = 1, message = "the salary field must be greater than zero")
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
