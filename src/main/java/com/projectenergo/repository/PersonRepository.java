package com.projectenergo.repository;

import com.projectenergo.entity.DocumentEntity;
import com.projectenergo.entity.PersonEntity;
import com.projectenergo.form.PersonSearchForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


/**
 * Created by aleksandr on 13.02.2016.
 */

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {



}
