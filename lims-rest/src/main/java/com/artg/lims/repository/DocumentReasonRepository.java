package com.artg.lims.repository;

import com.artg.lims.entities.DocumentReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentReasonRepository extends JpaRepository<DocumentReason, Long> {
}
