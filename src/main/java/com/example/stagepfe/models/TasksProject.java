package com.example.stagepfe.models;

import com.example.stagepfe.models.enumration.enumrationticketsname;
import com.example.stagepfe.models.enumration.enumrationticketstypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TasksProject {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long IdTasksProject;
    private Long idProjet;
   @Enumerated(EnumType.STRING)
    private enumrationticketsname enumrationticketsname;
    @Column(name="description")
    private String Description;

    private Number estimatedTime;
    private Number Progress;
    private String Priority;
    private Date TaskProjectStartDate;
    private Date TaskProjectEndDate;
    private String AssignedTo;
    @Enumerated(EnumType.STRING)
    private enumrationticketstypes enumrationticketstypes;
}
