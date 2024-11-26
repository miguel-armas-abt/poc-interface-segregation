package com.demo.poc.payments.service.incorrect.impl;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;
import com.demo.poc.payments.repository.CreditCardPaymentRepository;
import com.demo.poc.payments.service.incorrect.PaymentProcessor;

public class CreditCardPaymentProcessorImpl implements PaymentProcessor {

  private final CreditCardPaymentRepository creditCardPaymentRepository;

  public CreditCardPaymentProcessorImpl() {
    creditCardPaymentRepository = new CreditCardPaymentRepository();
  }

  @Override
  public PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO) {
    return creditCardPaymentRepository.savePayment("PROCESSED");
  }

  @Override
  public void validateCardNumber(String cardNumber) {
    if(cardNumber.length() < 16)
      throw new IllegalArgumentException("Invalid card number");
  }

  @Override
  public void validateBankAccount(String bankAccountNumber) {
    throw new IllegalArgumentException("NoRequiredMethod");
  }

  @Override
  public void validateEmail(String email) {
    throw new IllegalArgumentException("NoRequiredMethod");
  }

}
