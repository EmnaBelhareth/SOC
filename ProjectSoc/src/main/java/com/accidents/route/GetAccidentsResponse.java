//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.12.15 à 12:01:37 AM WEST 
//


package com.accidents.route;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://Route.accidents.com}accidents"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accidents"
})
@XmlRootElement(name = "getAccidentsResponse")
public class GetAccidentsResponse {

    @XmlElement(namespace = "http://Route.accidents.com", required = true)
    protected Accidents accidents;

    /**
     * Obtient la valeur de la propriété accidents.
     * 
     * @return
     *     possible object is
     *     {@link Accidents }
     *     
     */
    public Accidents getAccidents() {
        return accidents;
    }

    /**
     * Définit la valeur de la propriété accidents.
     * 
     * @param value
     *     allowed object is
     *     {@link Accidents }
     *     
     */
    public void setAccidents(Accidents value) {
        this.accidents = value;
    }

}
