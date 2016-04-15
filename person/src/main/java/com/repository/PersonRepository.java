package com.repository;

import com.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by hongpf on 16/4/15.
 */
public interface  PersonRepository extends PagingAndSortingRepository <Person,Long > {

    List<Person> findByLastName(String lastName);

}