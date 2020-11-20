package com.example.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.entity.EntityBean;
@Repository
public interface ContactsRepo extends CrudRepository<EntityBean, Serializable> {

}
