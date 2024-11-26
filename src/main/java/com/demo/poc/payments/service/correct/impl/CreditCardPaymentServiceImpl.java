package com.demo.poc.payments.service.correct.impl;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;
import com.demo.poc.payments.repository.CreditCardPaymentRepository;
import com.demo.poc.payments.service.correct.CreditCardPaymentService;

public class CreditCardPaymentServiceImpl implements CreditCardPaymentService {

  private final CreditCardPaymentRepository creditCardPaymentRepository;

  public CreditCardPaymentServiceImpl() {
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

}
