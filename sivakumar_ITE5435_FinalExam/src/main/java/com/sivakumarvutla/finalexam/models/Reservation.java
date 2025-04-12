package com.sivakumarvutla.finalexam.models;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.UUID;

@Document(collection = "reservations")
public class Reservation {

    @Id
    private String reservationId;
    private String firstName;
    private String lastName;
    private int numberOfPassengers;
    private String travelClass;
    private String phoneNumber;
    private String time;
    private String dateOfDeparting;

    public Reservation() {
        this.reservationId = UUID.randomUUID().toString();
    }


    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateOfDeparting() {
        return dateOfDeparting;
    }

    public void setDateOfDeparting(String dateOfDeparting) {
        this.dateOfDeparting = dateOfDeparting;
    }
}
