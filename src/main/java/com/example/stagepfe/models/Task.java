package com.example.stagepfe.models;

import com.example.stagepfe.models.enumration.enumrationticketsname;
import com.example.stagepfe.models.enumration.enumrationticketstypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long IdTasks;
    private Long idSprints;
    @Enumerated(EnumType.STRING)
    private enumrationticketsname enumrationticket;
    private String Description;
    private Number estimatedTime;
    private Number Progress;
    private String Priority;
    private Date TaskStartDate;
    private Date TaskEndDate;
    private String assignedTo;
    @Enumerated(EnumType.STRING)
    private enumrationticketstypes enumrationticketstype;

}
