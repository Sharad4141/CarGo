package com.app.pojos;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.app.enums.PaymentSatus;
import com.app.enums.PaymentType;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Embeddable

public class Fare {
private double amount;
@Column(name="transcation_id")
private String transactionId;
@Column(name="payment_type")
@Enumerated(EnumType.STRING)
private PaymentType paymentType;
@Column(name="payment_status")
@Enumerated(EnumType.STRING)
private PaymentSatus paymentStatus;
public Fare() {
	this.amount=0;
	this.paymentStatus=PaymentSatus.PENDING;
	this.transactionId="noidyet";
	this.paymentType=PaymentType.CASH;
}
}
