package com.artg.lims.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_program")
@NoArgsConstructor
@AllArgsConstructor
public class TestProgram {
    @Id
    @SequenceGenerator(name = "sq_test_programm", sequenceName = "sq_test_programm_id", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_programm")
    private Long id;

    private String registrationNumber;

    private Long productId;

    private Long productMaxAmount;

    private Long performerDepartmentId;

    private Long documentUnderlyingId;

    private Date beginDate;

    private Date endDate;

    private Long testProgrammTypeId;

    private TestProgramType testProgramType;

}
