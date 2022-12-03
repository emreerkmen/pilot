package com.repne.pilot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

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