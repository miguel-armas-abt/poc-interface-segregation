package com.demo.poc.payments.service.correct;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;


public interface PaypalPaymentService {

  PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO);

  void validateEmail(String email);
}