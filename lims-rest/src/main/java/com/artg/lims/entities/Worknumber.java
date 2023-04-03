package com.artg.lims.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worknumber {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_worknumber")
    @SequenceGenerator(name = "sq_worknumber", sequenceName = "sq_worknumber_id", allocationSize = 0)
    private Long id;
    private String number;

}
