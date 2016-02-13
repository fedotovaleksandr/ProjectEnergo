package com.projectenergo.repository;

import com.projectenergo.entity.DocumentEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aleksandr on 13.02.2016.
 */
public interface  DocumentRepository extends CrudRepository<DocumentEntity, Integer> {

}
