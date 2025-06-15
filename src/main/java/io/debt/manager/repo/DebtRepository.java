package io.debt.manager.repo;

import com.speedment.jpastreamer.application.JPAStreamer;
import io.debt.manager.model.Debt;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class DebtRepository {
    @Inject
    JPAStreamer jpaStreamer;

    public List<Debt> getDebts() {
        return jpaStreamer.stream(Debt.class).toList();
    }

}
