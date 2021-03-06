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
 * Source Class: ComminityMember <br>
 * @version generated on Wed Dec 07 16:17:27 MSK 2016 by Alperen
 */

public interface ComminityMember extends Person {

    /* ***************************************************
     * Property http://www.semanticweb.org/tp11501203/owl/ontology#IDinfo
     */
     
    /**
     * Gets all property values for the IDinfo property.<p>
     * 
     * @returns a collection of values for the IDinfo property.
     */
    Collection<? extends Object> getIDinfo();

    /**
     * Checks if the class has a IDinfo property value.<p>
     * 
     * @return true if there is a IDinfo property value.
     */
    boolean hasIDinfo();

    /**
     * Adds a IDinfo property value.<p>
     * 
     * @param newIDinfo the IDinfo property value to be added
     */
    void addIDinfo(Object newIDinfo);

    /**
     * Removes a IDinfo property value.<p>
     * 
     * @param oldIDinfo the IDinfo property value to be removed.
     */
    void removeIDinfo(Object oldIDinfo);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
