package com.demo.poc.payments.service.incorrect.impl;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;
import com.demo.poc.payments.repository.BankTransferPaymentRepository;
import com.demo.poc.payments.service.incorrect.PaymentProcessor;

public class BankTransferPaymentProcessorImpl implements PaymentProcessor {

  private final BankTransferPaymentRepository  repository;

  public BankTransferPaymentProcessorImpl() {
    repository = new BankTransferPaymentRepository();
  }

  @Override
  public PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO) {
    return repository.savePayment("PROCESSED");
  }

  @Override
  public void validateBankAccount(String bankAccountNumber) {
    if(bankAccountNumber.length() > 16)
      throw new IllegalArgumentException("Invalid bank account number");
  }

  @Override
  public void validateCardNumber(String cardNumber) {
    throw new IllegalArgumentException("NoRequiredMethod");
  }

  @Override
  public void validateEmail(String email) {
    throw new IllegalArgumentException("NoRequiredMethod");
  }
}
