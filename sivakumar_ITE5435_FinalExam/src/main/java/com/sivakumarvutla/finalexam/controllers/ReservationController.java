package com.sivakumarvutla.finalexam.controllers;

import com.sivakumarvutla.finalexam.models.Customer;
import com.sivakumarvutla.finalexam.models.Payment;
import com.sivakumarvutla.finalexam.models.Reservation;
import com.sivakumarvutla.finalexam.service.CustomerService;
import com.sivakumarvutla.finalexam.service.PaymentService;
import com.sivakumarvutla.finalexam.service.ReservationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/reservation")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("customer", new Customer());
        model.addAttribute("payment", new Payment());
        return "reservation_form";
    }

    @PostMapping("/submitReservation")
    public String submitReservation(
            @ModelAttribute Reservation reservation,
            @ModelAttribute Customer customer,
            @ModelAttribute Payment payment
    ) {
        customerService.saveCustomer(customer);
        Reservation savedReservation = reservationService.saveReservation(reservation);
        payment.setReservationId(savedReservation.getReservationId());
        paymentService.savePayment(payment);

        
        return "redirect:/reservations";
    }

    
    @GetMapping("/reservations")
    public String viewAllReservations(Model model) {
        List<Reservation> allReservations = reservationService.getAllReservations();
        model.addAttribute("reservations", allReservations);
        return "reservation_list";
    }

}
