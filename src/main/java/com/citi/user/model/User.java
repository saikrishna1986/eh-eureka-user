package com.citi.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    Integer id;
    String name;
    String account;
    String country;

}
