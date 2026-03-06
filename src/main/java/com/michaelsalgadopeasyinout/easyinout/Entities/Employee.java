package com.michaelsalgadopeasyinout.easyinout.entities;

import java.time.LocalDateTime;

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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
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
    @Setter(AccessLevel.NONE)
    @Column(name = "created_at", updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;
    @Setter(AccessLevel.NONE)
    @Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
    @OneToOne(mappedBy="employee")
    private User user;
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
}
