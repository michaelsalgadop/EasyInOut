package com.michaelsalgadopeasyinout.easyinout.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "Nombre invalido!")
    @Column(nullable = false, unique = true)
    private String name;
    @Column(length = 500)
    private String description;
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();
    
    public Department() {
        // Constructor vacío requerido por JPA
    }
    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
