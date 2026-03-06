package com.michaelsalgadopeasyinout.easyinout.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
