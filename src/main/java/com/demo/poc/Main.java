package com.demo.poc;

import com.demo.poc.payments.service.correct.PaypalPaymentService;
import com.demo.poc.payments.service.correct.impl.PaypalPaymentServiceImpl;
import com.demo.poc.payments.service.incorrect.PaymentProcessor;
import com.demo.poc.payments.service.incorrect.impl.BankTransferPaymentProcessorImpl;

public class Main {

  public static void main(String[] args) {
    //correct
    PaypalPaymentService paypalPaymentService = new PaypalPaymentServiceImpl();
    paypalPaymentService.validateEmail("miguel.armas.abt@gmail.com");

    //incorrect
    PaymentProcessor paymentProcessor = new BankTransferPaymentProcessorImpl();
    paymentProcessor.validateEmail("miguel.armas.abt@gmail.com");
  }
}