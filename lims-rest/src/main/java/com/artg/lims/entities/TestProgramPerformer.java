package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TestProgramPerformer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_test_program_performer")
    @SequenceGenerator(name = "sq_test_program_performer", sequenceName = "sq_test_program_performer_id", allocationSize = 0)
    private Long id;
    private String person;
    @ManyToOne
    @JoinColumn(name = "test_program_id", nullable = false)
    private TestProgram testProgram;
}
