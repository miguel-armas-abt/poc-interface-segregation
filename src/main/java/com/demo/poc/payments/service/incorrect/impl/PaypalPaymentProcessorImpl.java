package com.demo.poc.payments.service.incorrect.impl;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;
import com.demo.poc.payments.repository.PaypalPaymentRepository;
import com.demo.poc.payments.service.incorrect.PaymentProcessor;

public class PaypalPaymentProcessorImpl implements PaymentProcessor {

  private final PaypalPaymentRepository repository;

  public PaypalPaymentProcessorImpl() {
    repository = new PaypalPaymentRepository();
  }

  @Override
  public PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO) {
    return repository.savePayment("PROCESSED");
  }

  @Override
  public void validateBankAccount(String bankAccountNumber) {
    throw new IllegalArgumentException("NoRequiredMethod");
  }

  @Override
  public void validateCardNumber(String cardNumber) {
    throw new IllegalArgumentException("NoRequiredMethod");
  }

  @Override
  public void validateEmail(String email) {
    if(!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
      throw new IllegalArgumentException("Invalid email");
  }
}
