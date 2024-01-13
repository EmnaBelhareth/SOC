package com.routes.services;

import com.routes.Models.Accident;
import com.routes.Repositories.AccidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccidentService {

    private final AccidentRepository accRepo;

    @Autowired
    public AccidentService(AccidentRepository accRepo) {
        this.accRepo = accRepo;
    }

    public List<Accident> getAllAccidents() {
        return  accRepo.findAll();
    }

    // Other methods for fetching specific accidents, if needed
    // For example:
    // public Accident getAccidentById(Long id) {
    //     return accRepo.findById(id).orElse(null);
    // }
}
