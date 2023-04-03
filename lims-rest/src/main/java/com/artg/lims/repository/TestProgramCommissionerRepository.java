package com.artg.lims.repository;

import com.artg.lims.entities.TestProgramCommissioner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestProgramCommissionerRepository extends JpaRepository<TestProgramCommissioner, Long> {
}
