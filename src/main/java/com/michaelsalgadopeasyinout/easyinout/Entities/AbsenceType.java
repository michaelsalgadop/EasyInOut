package com.michaelsalgadopeasyinout.easyinout.entities;

import java.util.HashSet;
import java.util.Set;

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
@Table(name = "absence_types")
public class AbsenceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "Nombre invalido!")
    @Column(nullable = false, unique = true)
    private String name;
    private String description;
    @Column(name = "requires_approval")
    private boolean requiresApproval;
    @OneToMany(mappedBy = "absenceType", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Absence> absences = new HashSet<>();
    public AbsenceType() {
    }
    
    public AbsenceType(String name, String description) {
        this.name = name;
        this.description = description;
        this.requiresApproval = false;
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
    public boolean isRequiresApproval() {
        return requiresApproval;
    }
    public void setRequiresApproval(boolean requiresApproval) {
        this.requiresApproval = requiresApproval;
    }

    public Set<Absence> getAbsences() {
        return absences;
    }
    public void addAbsence(Absence absence) {
        absences.add(absence);
        absence.setAbsenceType(this);
    }
    public void removeAbsence(Absence absence) {
        absences.remove(absence);
        absence.setAbsenceType(null);
    }
}
