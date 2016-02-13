package com.projectenergo.entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.boot.orm.jpa.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * Created by aleksandr on 13.02.2016.
 */
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private String Name;

    @Column()
    private String Surname;

    @Column()
    private String Email;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = DocumentEntity.class)
    @LazyCollection(LazyCollectionOption.TRUE)
    private List<DocumentEntity> series = new Vector<DocumentEntity>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<DocumentEntity> getSeries() {
        return series;
    }

    public void setSeries(List<DocumentEntity> series) {
        this.series = series;
    }
}
