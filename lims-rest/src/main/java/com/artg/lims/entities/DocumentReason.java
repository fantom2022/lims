package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentReason {
    @Id
    @SequenceGenerator(name = "sq_document_reason", sequenceName = "sq_document_reason_id", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_document_reason")
    private Long id;
    private String registrationNumber;
    private String inventoryNumber;
    @ManyToOne
    @JoinColumn(name = "document_reason_type_id", nullable = false)
    private DocumentReasonType documentReasonType;
    @ManyToOne
    @JoinColumn(name = "test_program_id", nullable = false)
    private TestProgram testProgram;

}
