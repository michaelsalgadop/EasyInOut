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
    @OneToMany(mappedBy = "absenceType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Absence> absences = new ArrayList<>();
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

    public List<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }
    public void addAbsence(Absence absence) {
        absences.add(absence);
    }
}
