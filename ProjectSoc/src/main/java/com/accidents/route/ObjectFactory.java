//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.12.15 à 12:01:37 AM WEST 
//


package com.accidents.route;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.accidents.route package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.accidents.route
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccidentsRequest }
     * 
     */
    public GetAccidentsRequest createGetAccidentsRequest() {
        return new GetAccidentsRequest();
    }

    /**
     * Create an instance of {@link GetAccidentsResponse }
     * 
     */
    public GetAccidentsResponse createGetAccidentsResponse() {
        return new GetAccidentsResponse();
    }

    /**
     * Create an instance of {@link Accidents }
     * 
     */
    public Accidents createAccidents() {
        return new Accidents();
    }

    /**
     * Create an instance of {@link Accident }
     * 
     */
    public Accident createAccident() {
        return new Accident();
    }

}
