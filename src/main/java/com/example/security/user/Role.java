package com.example.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    @OneToOne
    private User userEntity;
    /*@ManyToMany(fetch = FetchType.EAGER)
    private List<Privileges> privileges;*/
   /* USER,
    ADMIN*/

}

