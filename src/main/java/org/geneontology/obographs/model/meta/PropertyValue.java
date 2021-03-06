package org.geneontology.obographs.model.meta;

import java.util.List;

import org.geneontology.obographs.model.Meta;

/**
 * Associates the container object with a value via a property.
 * 
 * For example, a node representing an OWL class may contain a {@link Meta} object
 * containing a PropertyValue mapping to a textual definition string via a definition property.
 * 
 * Broadly, there are two categories of implementing class:
 * 
 *  1. PropertyValues corresponding to a specific explicitly modeled property type (e.g synonym)
 *  2. generic {@link BasicPropertyValue}s - anything property not explicitly modeled
 *  
 * A PropertyValue is minimally a tuple `(pred,value)`. However, each sub tuple may also
 * be "annotated" with additional metadata (this corresponds to an Axiom Annotation in OWL)
 * 
 *  - Any tuple can be supported by an array of xrefs.
 *  - Some implementing classes may choose to model additional explicit annotations (e.g. {@link SynonymPropertyValue})
 * 
 * @author cjm
 *
 */
public interface PropertyValue {

    /**
     * Predicates correspond to OWL properties. Like all preds in this datamodel,
     * a pred is represented as a String which denotes a CURIE
     * 
     * @return the pred
     */
    public String getPred();

    /**
     * An array denoting objects that support the property value assertion
     * 
     * @return the xrefs
     */
    public List<String> getXrefs();

    /**
     * The value of the property-value
     * 
     * @return the val
     */
    public String getVal();



    /**
     * @return the meta
     */
    public Meta getMeta();

}
