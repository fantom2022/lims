package com.artg.lims.repository;

import com.artg.lims.entities.TestProgramType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestProgramTypeRepository extends JpaRepository<TestProgramType, Long> {
}
