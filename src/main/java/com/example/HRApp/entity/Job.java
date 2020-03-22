package com.example.HRApp.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

import static com.example.HRApp.constants.SetUpConstants.ID_LENGTH;


@Data
@Entity
@ToString
@Table(name="job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id", length = ID_LENGTH)
    private String identifier;

    @Column(name = "job_title")
    private  String jobTitle;

    @Column(name = "job_description")
    private  String jobDescription;

    @Column(name = "number_people")
    private String numberOfPeople;

   @Column(name = "application_date")
    private Date applicationDate;

   @NotNull
   @Column(name = "isActive")
    private Boolean isActive=true;


}
