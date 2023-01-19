package com.artg.lims.repositories;

import com.artg.lims.entities.TestProgramm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestProgrammRepository extends JpaRepository<TestProgramm, Long> {
}
