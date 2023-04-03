package com.artg.lims.repository;

import com.artg.lims.entities.Worknumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorknumberRepository extends JpaRepository<Worknumber, Long> {
}
