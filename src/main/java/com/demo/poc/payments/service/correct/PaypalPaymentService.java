package com.demo.poc.payments.service.correct;

public interface PaypalPaymentService extends PaymentProcessorService{

  void validateEmail(String email);
}