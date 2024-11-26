package com.demo.poc.payments.service.incorrect;

import com.demo.poc.payments.dto.PaymentRequestDTO;
import com.demo.poc.payments.dto.PaymentResponseDTO;

/**
 * La interface impone métodos que no son necesarios para cada tipo de pago, obligando a implementar métodos vacíos o inútiles.
 */
public interface PaymentProcessor {

  PaymentResponseDTO processPayment(PaymentRequestDTO requestDTO);

  void validateBankAccount(String bankAccountNumber);  // Este método solo tiene sentido para pagos por transferencia

  void validateCardNumber(String cardNumber);  // Este método solo tiene sentido para pagos con tarjeta

  void validateEmail(String email); // Este método solo tiene sentido para pagos con Paypal
}