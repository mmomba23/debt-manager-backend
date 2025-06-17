package io.debt.manager.repo;

import com.speedment.jpastreamer.application.JPAStreamer;
import io.debt.manager.model.Debt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class DebtRepository {
    @Inject
    JPAStreamer jpaStreamer;

    public List<Debt> getDebts() {
        return jpaStreamer.stream(Debt.class).toList();
    }
    @Transactional
    public Debt update(Debt debt) {
        Debt latestRecord= Debt.findById(debt.id);
        if (latestRecord != null) {
            latestRecord.description = debt.description;
            latestRecord.initialAmount = debt.initialAmount;
            latestRecord.interestRate = debt.interestRate;
            latestRecord.outstandingBalance = debt.outstandingBalance;
            latestRecord.description = debt.description;
            latestRecord.creditor = debt.creditor;
            latestRecord.dueDate = debt.dueDate;
            latestRecord.paid = debt.paid;

        }
        return latestRecord;
    }
}
