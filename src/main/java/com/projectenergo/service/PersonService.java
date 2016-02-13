package com.projectenergo.service;

import com.projectenergo.entity.PersonEntity;
import com.projectenergo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aleksandr on 13.02.2016.
 */
@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public void setProductRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Iterable<PersonEntity> listAllPerson() {
        return personRepository.findAll();
    }
}
