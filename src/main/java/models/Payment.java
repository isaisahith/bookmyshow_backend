package models;

import jakarta.persistence.Entity;
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
    private PaymentStatus paymentStatus;
    private PaymentGateway paymentGateway;
    private PaymentMode paymentMode;
}
