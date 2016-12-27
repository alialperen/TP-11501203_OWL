package tr.gov.cbrt.hwOwl.model;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Public <br>
 * @version generated on Wed Dec 07 16:17:27 MSK 2016 by Alperen
 */

public interface Public extends Organization {

    /* ***************************************************
     * Property http://www.semanticweb.org/tp11501203/owl/ontology#has
     */
     
    /**
     * Gets all property values for the has property.<p>
     * 
     * @returns a collection of values for the has property.
     */
    Collection<? extends Person> getHas();

    /**
     * Checks if the class has a has property value.<p>
     * 
     * @return true if there is a has property value.
     */
    boolean hasHas();

    /**
     * Adds a has property value.<p>
     * 
     * @param newHas the has property value to be added
     */
    void addHas(Person newHas);

    /**
     * Removes a has property value.<p>
     * 
     * @param oldHas the has property value to be removed.
     */
    void removeHas(Person oldHas);


    /* ***************************************************
     * Property http://www.semanticweb.org/tp11501203/owl/ontology#outputs
     */
     
    /**
     * Gets all property values for the outputs property.<p>
     * 
     * @returns a collection of values for the outputs property.
     */
    Collection<? extends Service> getOutputs();

    /**
     * Checks if the class has a outputs property value.<p>
     * 
     * @return true if there is a outputs property value.
     */
    boolean hasOutputs();

    /**
     * Adds a outputs property value.<p>
     * 
     * @param newOutputs the outputs property value to be added
     */
    void addOutputs(Service newOutputs);

    /**
     * Removes a outputs property value.<p>
     * 
     * @param oldOutputs the outputs property value to be removed.
     */
    void removeOutputs(Service oldOutputs);


    /* ***************************************************
     * Property http://www.semanticweb.org/tp11501203/owl/ontology#worksIn
     */
     
    /**
     * Gets all property values for the worksIn property.<p>
     * 
     * @returns a collection of values for the worksIn property.
     */
    Collection<? extends Person> getWorksIn();

    /**
     * Checks if the class has a worksIn property value.<p>
     * 
     * @return true if there is a worksIn property value.
     */
    boolean hasWorksIn();

    /**
     * Adds a worksIn property value.<p>
     * 
     * @param newWorksIn the worksIn property value to be added
     */
    void addWorksIn(Person newWorksIn);

    /**
     * Removes a worksIn property value.<p>
     * 
     * @param oldWorksIn the worksIn property value to be removed.
     */
    void removeWorksIn(Person oldWorksIn);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
