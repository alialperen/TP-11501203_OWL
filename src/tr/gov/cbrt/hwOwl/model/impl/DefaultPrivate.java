package tr.gov.cbrt.hwOwl.model.impl;

import tr.gov.cbrt.hwOwl.model.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultPrivate <br>
 * @version generated on Wed Dec 07 16:17:27 MSK 2016 by Alperen
 */
public class DefaultPrivate extends WrappedIndividualImpl implements Private {

    public DefaultPrivate(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/tp11501203/owl/ontology#has
     */
     
    public Collection<? extends Person> getHas() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS,
                                               DefaultPerson.class);
    }

    public boolean hasHas() {
	   return !getHas().isEmpty();
    }

    public void addHas(Person newHas) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS,
                                       newHas);
    }

    public void removeHas(Person oldHas) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS,
                                          oldHas);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/tp11501203/owl/ontology#outputs
     */
     
    public Collection<? extends Service> getOutputs() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OUTPUTS,
                                               DefaultService.class);
    }

    public boolean hasOutputs() {
	   return !getOutputs().isEmpty();
    }

    public void addOutputs(Service newOutputs) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OUTPUTS,
                                       newOutputs);
    }

    public void removeOutputs(Service oldOutputs) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OUTPUTS,
                                          oldOutputs);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/tp11501203/owl/ontology#worksIn
     */
     
    public Collection<? extends Person> getWorksIn() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_WORKSIN,
                                               DefaultPerson.class);
    }

    public boolean hasWorksIn() {
	   return !getWorksIn().isEmpty();
    }

    public void addWorksIn(Person newWorksIn) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_WORKSIN,
                                       newWorksIn);
    }

    public void removeWorksIn(Person oldWorksIn) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_WORKSIN,
                                          oldWorksIn);
    }


}
