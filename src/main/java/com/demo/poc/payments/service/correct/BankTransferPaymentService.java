package com.demo.poc.payments.service.correct;

public interface BankTransferPaymentService extends PaymentProcessorService {

  void validateBankAccount(String bankAccountNumber);

}