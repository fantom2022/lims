package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentReasonType {
    @Id
    @SequenceGenerator(name = "sq_document_reason_type", allocationSize = 0, sequenceName = "sq_document_reason_type_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_document_reason_type_id")
    private Long id;
    private String name;
    @OneToMany(mappedBy = "documentReasonType")
    private List<DocumentReason> documentReason;
}
