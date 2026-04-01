package com.michaelsalgadopeasyinout.easyinout.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@Table(name = "time_records")
public class TimeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String notes;

    public TimeRecord(Long id, Employee employee, LocalDateTime checkIn,
            LocalDateTime checkOut, String notes) {
        this.id = id;
        this.employee = employee;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.notes = notes;
    }
}
