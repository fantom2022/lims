package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "test_program_type")
@NoArgsConstructor
@AllArgsConstructor
public class TestProgramType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_program_type")
    @SequenceGenerator(name = "sq_test_program_type",sequenceName = "sq_test_program_type_id",allocationSize = 0)
    private Long id;

    @Column(name = "short_name")
    private String shortName;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "testProgramType")
    List<TestProgram> testProgramList;
}
