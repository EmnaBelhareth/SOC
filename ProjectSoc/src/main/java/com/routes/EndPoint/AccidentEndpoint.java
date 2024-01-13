package com.routes.EndPoint;

import com.accidents.route.Accidents;
import com.accidents.route.GetAccidentsResponse;
import com.routes.Models.Accident;
import com.routes.services.AccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Endpoint
public class AccidentEndpoint {

    private final AccidentService accServ;

    @Autowired
    public AccidentEndpoint(AccidentService accServ) {
        this.accServ = accServ;
    }

    @PayloadRoot(namespace = "http://Route.accidents.com", localPart = "getAccidentsRequest")
    @ResponsePayload
    public GetAccidentsResponse getAccidentRequest() {
        GetAccidentsResponse response = new GetAccidentsResponse();
        List<Accident> accidents = accServ.getAllAccidents();

        List<com.accidents.route.Accident> convertedAccidents = accidents.stream()
                .map(this::convertToAccident)
                .collect(Collectors.toList());

        Accidents accidentsWrapper = new Accidents();
        accidentsWrapper.getAccident().addAll(convertedAccidents);

        response.setAccidents(accidentsWrapper);
        return response;
    }

    private com.accidents.route.Accident convertToAccident(Accident newAccident) {
        com.accidents.route.Accident accident = new com.accidents.route.Accident();
        accident.setId(newAccident.getId());
        accident.setRaisons(newAccident.getRaisons());
        accident.setAccidents(BigInteger.valueOf(newAccident.getAccidents()));
        accident.setMorts(BigInteger.valueOf(newAccident.getMorts()));
        accident.setBlesses(BigInteger.valueOf(newAccident.getBlesses()));
        return accident;
    }
}
