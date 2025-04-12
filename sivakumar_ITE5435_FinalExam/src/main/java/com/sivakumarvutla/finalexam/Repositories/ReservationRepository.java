package com.sivakumarvutla.finalexam.Repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.sivakumarvutla.finalexam.models.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}

