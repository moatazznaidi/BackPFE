package com.example.stagepfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Sprints")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSprints;
    private Long idProjet;
    @Column(name = "SprintName")
    private String SprintName;


    private String Description;

    private Date SprintStartDate;

    private Date SprintEndDate;



}