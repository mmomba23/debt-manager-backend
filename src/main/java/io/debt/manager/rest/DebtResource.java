package io.debt.manager.rest;

import io.debt.manager.model.Debt;
import io.debt.manager.service.DebtService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
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
        debt.id=null;
        debtService.addDebt(debt);
        return Response.status(Response.Status.CREATED)
                .entity(debt).build();
    }

    @GET
    public List<Debt> getDebts() {
        return debtService.getDebts();
    }

    @PUT
    @Path("/{id}")
    public Response updateDebt(@RequestBody Debt debt) {
        Debt updatedRecord=debtService.updateDebt(debt);
        return Response.status(Response.Status.ACCEPTED).entity(updatedRecord).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteDebt(@PathParam("id") Integer id) {
        debtService.deleteDebt(id);
        return Response.status(Response.Status.ACCEPTED).entity(id).build();
    }

}
