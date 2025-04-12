package com.sivakumarvutla.finalexam.service;

import com.sivakumarvutla.finalexam.Repositories.PaymentRepository;
import com.sivakumarvutla.finalexam.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
