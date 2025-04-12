package com.sivakumarvutla.finalexam.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sivakumarvutla.finalexam.models.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
