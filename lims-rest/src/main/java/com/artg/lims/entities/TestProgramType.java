package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "test_program_type")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TestProgramType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_program_type")
    @SequenceGenerator(name = "sq_test_program_type", sequenceName = "sq_test_program_type_id", allocationSize = 0)
    private Long id;
    private String shortName;
    private String designation;
    private Boolean archiveFlag;
    @OneToMany(mappedBy = "testProgramType")
    private List<TestProgram> testPrograms;
}
