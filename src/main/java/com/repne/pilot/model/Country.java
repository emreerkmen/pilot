package com.repne.pilot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * countiry
 */
@Entity // for JPA
@Data // for Lombok
public class Country {

    @Id
    public int id;
    public String name;
}