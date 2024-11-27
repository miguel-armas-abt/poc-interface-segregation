package com.demo.poc.payments.service.correct;

public interface CreditCardPaymentService extends PaymentProcessorService{

  void validateCardNumber(String cardNumber);

}