package com.saisahith.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;



@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private Date paymentDate;
    private String refNumber;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentGateway paymentGateway;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
    @ManyToOne
    private Booking booking;
}
