package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestProgramCommissioner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_program_commissioner")
    @SequenceGenerator(name = "sq_test_program_commissioner", sequenceName = "sq_test_program_commissioner_id", allocationSize = 0)
    private Long id;
    //TODO: dict_person
    private String personName;
    private Date signDate;
    @ManyToOne
    @JoinColumn(name = "test_program_id", nullable = false)
    private TestProgram testProgram;
}
