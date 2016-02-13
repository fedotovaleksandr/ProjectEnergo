package com.projectenergo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by aleksandr on 13.02.2016.
 */
@Entity
@Table(name = "document", indexes = {
        @Index(columnList = "UniqueNumber", name = "UniqueNumber_index")})
public class DocumentEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private String Title;

    @NotEmpty
    @Column(unique = true)
    private String UniqueNumber;

    @ManyToOne()
    @JoinColumn(name = "person_id")
    private PersonEntity person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUniqueNumber() {
        return UniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        UniqueNumber = uniqueNumber;
    }
}
