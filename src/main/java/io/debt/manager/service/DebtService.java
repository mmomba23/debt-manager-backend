package io.debt.manager.service;

import io.debt.manager.model.Debt;
import io.debt.manager.repo.DebtRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class DebtService {
    @Inject
    DebtRepository debtRepository;
    @Transactional
    public Debt addDebt(Debt debt) {
        debt.persist();
        return debt;
    }
    public List<Debt> getDebts() {
        return debtRepository.getDebts();
    }

    public Debt updateDebt(Debt debt) {
        return debtRepository.update(debt);
    }
    @Transactional
    public void deleteDebt(Integer id) {
        Debt debt=Debt.findById(id);
        debt.delete();
    }
}
