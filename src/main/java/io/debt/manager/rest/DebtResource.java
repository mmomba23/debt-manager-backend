package io.debt.manager.rest;

import io.debt.manager.model.Debt;
import io.debt.manager.service.DebtService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import java.util.List;

@Path("/debts")
@Consumes(MediaType.APPLICATION_JSON)
public class DebtResource {
    @Inject
    DebtService debtService;
    @POST
    public Response addDebt(@RequestBody Debt debt) {
        debtService.addDebt(debt);
        return Response.status(Response.Status.CREATED)
                .entity(debt).build();
    }

    @GET
    public List<Debt> getDebts() {
        return debtService.getDebts();
    }
}
