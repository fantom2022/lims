package com.artg.lims.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "test_programm_type")
@NoArgsConstructor
@AllArgsConstructor
public class TestProgrammType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_programm_type")
    @SequenceGenerator(name = "sq_test_programm_type",sequenceName = "sq_test_programm_type_id",allocationSize = 0)
    private Long id;

    @Column(name = "short_name")
    private String shortName;

    @Column(name="designation")
    private String designation;

    @OneToMany(mappedBy = "testProgrammType")
    List<TestProgramm> testProgrammList;
}
