package com.bankapp.basics;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString(exclude = {"tempCalcalation"}
)
@NoArgsConstructor
@EqualsAndHashCode
 public class Account {

    private Integer id;

  
    private String name;
   
    private BigDecimal balance;

   
    private CustomerType customerType;

   
    private Date date;

 
    private int tempCalcalation;

   public Account(String name, BigDecimal balance, CustomerType customerType, Date date) {
      this.name = name;
      this.balance = balance;
      this.customerType = customerType;
      this.date = date;
   }
}
