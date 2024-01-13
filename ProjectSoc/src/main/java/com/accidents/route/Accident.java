//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2023.12.15 à 12:01:37 AM WEST 
//


package com.accidents.route;

import java.math.BigInteger;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="raisons" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accidents" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="morts" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="blesses" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "id",
    "raisons",
    "accidents",
    "morts",
    "blesses"
})
@XmlRootElement(name = "Accident")
public class Accident {

    protected int id;
    @XmlElement(required = true)
    protected String raisons;
    @XmlElement(required = true)
    protected BigInteger accidents;
    @XmlElement(required = true)
    protected BigInteger morts;
    @XmlElement(required = true)
    protected BigInteger blesses;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété raisons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisons() {
        return raisons;
    }

    /**
     * Définit la valeur de la propriété raisons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisons(String value) {
        this.raisons = value;
    }

    /**
     * Obtient la valeur de la propriété accidents.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccidents() {
        return accidents;
    }

    /**
     * Définit la valeur de la propriété accidents.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccidents(BigInteger value) {
        this.accidents = value;
    }

    /**
     * Obtient la valeur de la propriété morts.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMorts() {
        return morts;
    }

    /**
     * Définit la valeur de la propriété morts.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMorts(BigInteger value) {
        this.morts = value;
    }

    /**
     * Obtient la valeur de la propriété blesses.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlesses() {
        return blesses;
    }

    /**
     * Définit la valeur de la propriété blesses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlesses(BigInteger value) {
        this.blesses = value;
    }

}
