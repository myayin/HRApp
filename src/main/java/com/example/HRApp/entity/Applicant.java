package com.example.HRApp.entity;

import com.example.HRApp.constants.SetUpConstants;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import static com.example.HRApp.constants.SetUpConstants.ID_LENGTH;


@Data
@Entity
@ToString
@Table(name="applicant")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id", length = ID_LENGTH)
    private String identifier;

    @NotNull
    @Column(name = "name")
    private  String name;

    @NotNull
    @Column(name = "phone")
    private String phone;

    @NotNull
    @Column(name = "email")
    @Pattern(regexp = SetUpConstants.MAIL_PATTERN
            , message = "invalid.email.pattern")
    private String email;

    @NotNull
    @Column(name = "address")
    private String address;


    @Column(name = "thoughts")
    private String thoughts;

    @Column(name = "job_id")
        private String jobId;




}
