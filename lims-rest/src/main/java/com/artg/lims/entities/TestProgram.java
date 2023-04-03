package com.artg.lims.entities;

import com.artg.lims.entities.extension.ProductExtension;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
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

    @OneToMany(mappedBy = "testProgram")
    private Set<DocumentReason> documentReasons = new HashSet<>();
    @OneToMany(mappedBy = "testProgram")
    private Set<TestProgramCommissioner> commissioners = new HashSet<>();
    @OneToMany(mappedBy = "testProgram")
    private Set<TestProgramPerformer> performers = new HashSet<>();

    //TODO: каскад
    @ManyToMany
    @JoinTable(
            name = "test_program_plantasks",
            joinColumns = @JoinColumn(name = "test_program_id"),
            inverseJoinColumns = @JoinColumn(name = "plantask_id")
    )
    private Set<Plantask> plantasks = new HashSet<Plantask>();

    @ManyToMany
    @JoinTable(
            name = "test_program_worknumbers",
            joinColumns = @JoinColumn(name = "test_program_id"),
            inverseJoinColumns = @JoinColumn(name = "worknumber_id")
    )
    private Set<Worknumber> worknumbers = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "test_program_accompanying_passports",
            joinColumns = @JoinColumn(name = "test_program_id"),
            inverseJoinColumns = @JoinColumn(name = "passport_id")
    )
    private Set<AccompanyingPassport> passports = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "test_program_type_id", nullable = false)
    private TestProgramType testProgramType;

    @ManyToOne
    @JoinColumn(name = "testing_product_id")
    private Product testingProduct;

    @ManyToOne
    @JoinColumn(name = "testing_product_ext_id")
    private ProductExtension testingProductExt;

    public void addPlantask(Plantask plantask) {
        this.plantasks.add(plantask);
    }

    public void removePlantask(Plantask plantask) {
        this.plantasks.remove(plantask);
    }

    public void addAccompanyingPassport(AccompanyingPassport accompanyingPassport) {
        this.passports.add(accompanyingPassport);
    }

    public void removeAccompanyingPassport(AccompanyingPassport accompanyingPassport) {
        this.passports.remove(accompanyingPassport);
    }

    public void addWorknumber(Worknumber worknumber) {
        this.worknumbers.add(worknumber);
    }

    public void removeWorknumber(Worknumber worknumber) {
        this.worknumbers.remove(worknumber);
    }
}
