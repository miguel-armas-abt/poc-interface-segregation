package com.demo.poc.payments.service.correct.impl;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;
import com.demo.poc.payments.repository.PaypalPaymentRepository;
import com.demo.poc.payments.service.correct.PaypalPaymentService;

public class PaypalPaymentServiceImpl implements PaypalPaymentService {

  private final PaypalPaymentRepository repository;

  public PaypalPaymentServiceImpl() {
    repository = new PaypalPaymentRepository();
  }

  @Override
  public PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO) {
    return repository.savePayment("PROCESSED");
  }

  @Override
  public void validateEmail(String email) {
    if(!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
      throw new IllegalArgumentException("Invalid email");
  }
}
