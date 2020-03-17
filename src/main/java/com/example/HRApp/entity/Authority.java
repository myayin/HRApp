package com.example.HRApp.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static com.example.HRApp.constants.SetUpConstants.ID_LENGTH;


@Data
@Entity
@ToString
@Table(name="authority")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "id", length = ID_LENGTH)
    private String identifier;

    @Column(name="user_id")
    private String userId;

    @Column(name="role")
    private String role;

    public Authority(String userId, String role){
        this.userId = userId;
        this.role = role;
    }

}
