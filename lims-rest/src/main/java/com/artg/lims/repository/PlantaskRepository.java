package com.artg.lims.repository;

import com.artg.lims.entities.Plantask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaskRepository extends JpaRepository<Plantask, Long> {
}
