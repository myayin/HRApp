package com.example.HRApp.entity;

import com.example.HRApp.constants.SetUpConstants;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import static com.example.HRApp.constants.SetUpConstants.ID_LENGTH;


@Data
@Entity
@ToString
@Table(name="hr")
public class HR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id", length = ID_LENGTH)
    private String identifier;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    @Pattern(regexp = SetUpConstants.MAIL_PATTERN
            , message = "invalid.email.pattern")
    private String email;

}
