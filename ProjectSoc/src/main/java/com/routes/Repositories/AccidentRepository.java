package com.routes.Repositories;

import com.routes.Models.Accident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccidentRepository extends JpaRepository<Accident,Integer> {

    //Accident findbyRaisons();
}
