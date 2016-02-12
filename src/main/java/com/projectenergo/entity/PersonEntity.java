package com.projectenergo.entity;

import org.springframework.boot.orm.jpa.EntityScan;

import java.io.Serializable;

/**
 * Created by aleksandr on 13.02.2016.
 */
@EntityScan
@Table("person")
public class PersonEntity implements Serializable {
}
