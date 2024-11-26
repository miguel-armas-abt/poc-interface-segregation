package com.demo.poc.payments.repository;

import com.demo.poc.payments.dto.PaymentResponseDTO;

import java.util.HashMap;
import java.util.Map;

public class BankTransferPaymentRepository {

  private static final Map<String, String> dataSource = new HashMap<>();

  public PaymentResponseDTO savePayment(String paymentStatus) {
    String paymentId = "CC" + Math.random();
    dataSource.put(paymentId, paymentStatus);
    return PaymentResponseDTO.builder()
        .id(paymentId)
        .build();
  }
}
