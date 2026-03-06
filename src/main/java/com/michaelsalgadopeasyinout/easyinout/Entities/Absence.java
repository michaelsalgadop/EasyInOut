package com.michaelsalgadopeasyinout.easyinout.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "absences")
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false) // clave foránea
    private Employee employee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "absence_type_id", nullable = false) // clave foránea
    private AbsenceType absenceType;
    @Column(name = "start_datetime", nullable = false)
    private LocalDateTime startDatetime;
    @Column(name = "end_datetime", nullable = false)
    private LocalDateTime endDatetime;
    private String reason;
    @Enumerated(EnumType.STRING)
    @Column(name="status", nullable = false)
    private AbsenceStatus status;
    @Column(name = "created_at", updatable = false)
	@CreatedDate
	private LocalDateTime createdAt;
    @Column(name = "updated_at")
	@LastModifiedDate
	private LocalDateTime updatedAt;
    public Absence() {
    }
    public Absence(Employee employee, AbsenceType absenceType, LocalDateTime startDatetime,
            LocalDateTime endDatetime, String reason) {
        this.employee = employee;
        this.absenceType = absenceType;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.reason = reason;
        this.status = AbsenceStatus.PENDING;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public AbsenceType getAbsenceType() {
        return absenceType;
    }
    public void setAbsenceType(AbsenceType absenceType) {
        this.absenceType = absenceType;
    }
    public LocalDateTime getStartDatetime() {
        return startDatetime;
    }
    public void setStartDatetime(LocalDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }
    public LocalDateTime getEndDatetime() {
        return endDatetime;
    }
    public void setEndDatetime(LocalDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public AbsenceStatus getStatus() {
        return status;
    }
    public void setStatus(AbsenceStatus status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    
}
