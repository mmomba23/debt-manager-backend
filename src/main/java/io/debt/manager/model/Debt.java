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
     boolean paid) {
        this.creditor= creditor;
        this.description=  description;
        this.initialAmount=initialAmount;
        this.outstandingBalance=outstandingBalance;
        this.dueDate=dueDate;
        this.paid=paid;
    }
    public String creditor;
    public String description;
    public BigDecimal initialAmount;
    public BigDecimal outstandingBalance;
    public LocalDate dueDate;
    public boolean paid;
}
