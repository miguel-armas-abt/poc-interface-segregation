package com.demo.poc.payments.dto;

import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequestDTO {

  private String paymentMethod;
  private double amount;
}
