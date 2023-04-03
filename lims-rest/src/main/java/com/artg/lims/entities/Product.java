package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "dict_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String designation;
    private Boolean archiveFlag;

    @OneToMany(mappedBy = "testingProduct")
    private Set<TestProgram> testPrograms = new HashSet<>();

    @OneToMany(mappedBy = "product")
    private Set<Plantask> plantasks = new HashSet<>();

    @OneToMany(mappedBy = "product")
    private Set<AccompanyingPassport> passports = new HashSet<>();
}
