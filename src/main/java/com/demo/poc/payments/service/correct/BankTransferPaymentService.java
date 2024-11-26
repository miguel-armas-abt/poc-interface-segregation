package com.demo.poc.payments.service.correct;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;

public interface BankTransferPaymentService {

  PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO);

  void validateBankAccount(String bankAccountNumber);

}