package com.sivakumarvutla.finalexam.Repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.sivakumarvutla.finalexam.models.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}

