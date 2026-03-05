package com.michaelsalgadopeasyinout.easyinout.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "DNI invalido!")
    @Size(min = 9, max = 9, message = "DNI debe tener 9 caracteres")
    @Pattern(regexp = "^[0-9]{8}[A-Za-z]$", message = "Formato de DNI inválido")
    @Column(length = 9, nullable = false, unique = true)
    private String dni;
    @NotBlank(message = "Nombre invalido!")
    @Size(min = 2, max = 50, message = "Nombre debe tener entre 2 y 50 caracteres")
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @NotBlank(message = "Apellido invalido!")
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @NotBlank(message = "Email invalido!")
    @Email(message = "Email no tiene un formato válido!")
    @Column(nullable = false, unique = true)
    private String email;
    private int phone;
    @Column(name = "hire_date")
    private LocalDateTime hireDate;
    @Column(nullable=false)
    private boolean active = true;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false) // clave foránea
    private Department department;
    @Column(name = "created_at", updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;
    @Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<TimeRecord> timeRecords = new HashSet<>();
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Absence> absences = new HashSet<>();
    @OneToOne(mappedBy="employee")
    private User user;
    public Employee() {
    }
    public Employee(String dni, String firstName, String lastName, String email, int phone,
            LocalDateTime hireDate, Department department) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.hireDate = hireDate;
        this.department = department;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Set<TimeRecord> getTimeRecords() {
        return timeRecords;
    }
    public void addTimeRecord(TimeRecord timeRecord){
        timeRecords.add(timeRecord);
    }
    public void removeTimeRecord(TimeRecord timeRecord) {
        timeRecords.remove(timeRecord);
        timeRecord.setEmployee(null);
    }
    public Set<Absence> getAbsences() {
        return absences;
    }
    public void addAbsence(Absence absence){
        absences.add(absence);
    }
    public void removeAbsence(Absence absence) {
        absences.remove(absence);
        absence.setEmployee(null);
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public LocalDateTime getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id != null && id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
