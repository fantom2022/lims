package com.artg.lims.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "test_program")
@NoArgsConstructor
@AllArgsConstructor
public class TestProgram {
    @Id
    @SequenceGenerator(name = "sq_test_program", sequenceName = "sq_test_program_id", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_program")
    private Long id;
    private String registrationNumber;
    private Date beginDate;
    private Date endDate;
    private Long testingProductMaxAmount;
    private Long testingProductAmount;
    private Long documentReasonId;

    @OneToMany(mappedBy = "testProgram")
    private List<DocumentReason> documentReasons;

    //TODO: каскад
    @ManyToMany
    @JoinTable(
            name = "test_program_plantasks",
            joinColumns = @JoinColumn(name = "test_program_id"),
            inverseJoinColumns = @JoinColumn(name = "plantask_id")
    )
    private Set<Plantask> plantasks = new HashSet<Plantask>();

    @ManyToOne
    @JoinColumn(name = "test_program_type_id")
    private TestProgramType testProgramType;
    @ManyToOne
    @JoinColumn(name = "testing_product_id")
    private Product testingProduct;

    public void addPlantask(Plantask plantask){
        this.plantasks.add(plantask);
    }

    public void removePlantask(Plantask plantask){
        this.plantasks.remove(plantask);
    }
}
