package io.debt.manager.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
public class Debt extends PanacheEntity {
    public Debt() {}
    public Debt(String creditor,
    String description,
    BigDecimal initialAmount,
    BigDecimal outstandingBalance,
    LocalDate dueDate,
     boolean paid,BigDecimal interestRate) {
        this.creditor= creditor;
        this.description=  description;
        this.initialAmount=initialAmount;
        this.outstandingBalance=outstandingBalance;
        this.dueDate=dueDate;
        this.paid=paid;
        this.interestRate=interestRate;
    }
    public String creditor;
    public String description;
    public BigDecimal initialAmount;
    public BigDecimal outstandingBalance;
    public BigDecimal interestRate;
    public LocalDate dueDate;
    public boolean paid;

}
