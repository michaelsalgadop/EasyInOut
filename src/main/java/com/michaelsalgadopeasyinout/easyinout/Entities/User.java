package com.michaelsalgadopeasyinout.easyinout.Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable=false)
    private boolean enabled = true;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", unique = true, nullable = true)
    private Employee employee;
    @Column(name = "created_at")
	@CreatedDate
	private LocalDateTime createdAt;
    @Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    name = "user_roles", 
    joinColumns = @JoinColumn(name = "user_id"), 
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private List<Rol> roles = new ArrayList<>();
    public User() {
    }
    public User(String username, String password, Employee employee) {
        this.username = username;
        this.password = password;
        this.employee = employee;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
}
