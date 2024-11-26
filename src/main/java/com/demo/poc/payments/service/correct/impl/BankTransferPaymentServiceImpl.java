package com.demo.poc.payments.service.correct.impl;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;
import com.demo.poc.payments.repository.BankTransferPaymentRepository;
import com.demo.poc.payments.service.correct.BankTransferPaymentService;

public class BankTransferPaymentServiceImpl implements BankTransferPaymentService {

  private final BankTransferPaymentRepository  repository;

  public BankTransferPaymentServiceImpl() {
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
}
