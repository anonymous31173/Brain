/**
 * 
 */
package uk.ac.ebi.brain.error;

/**
 * @author Samuel Croset
 *
 */
@SuppressWarnings("serial")
public class ExistingClassException extends ExistingEntityException {

    public ExistingClassException(String message) {
	super(message);
    }
    
}
