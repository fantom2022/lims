package com.artg.lims.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_programm")
@NoArgsConstructor
@AllArgsConstructor
public class TestProgramm {
    @Id
    @SequenceGenerator(name = "sq_test_programm", sequenceName = "sq_test_programm_id", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_programm")
    private Long id;

    @Column(name = "registration_number", nullable = false)
    private String registrationNumber;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_max_amount")
    private Long productMaxAmount;

    @Column(name = "performer_department_id")
    private Long performerDepartmentId;

    @Column(name = "doc_underlying_id")
    private Long documentUnderlyingId;

    @Column(name = "begin_date")
    private Date beginDate;

    @Column(name = "end_date")
    private Date endDate;

//    @Column(name = "test_programm_type_id")
//    private Long testProgrammTypeId;

    @ManyToOne
    @JoinColumn (name="test_programm_type_id")
    private TestProgrammType testProgrammType;

}
