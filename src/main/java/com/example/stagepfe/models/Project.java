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
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;

    private String Name;

    private String Description;
    private Integer is_public;

    private Date Start;
    private Date StartDate;
    private Date EndDate;
    private String workstatus;
    private Integer team;
    private Number Progress;
    private String Client;
    private String Priority;
    private Integer price;
    private String CreatedBy;
}