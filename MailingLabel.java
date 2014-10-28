import java.io.Serializable;

/**
 * This class represents a mailing label. It implements the serializable
 * interface. Its data members (name, address, city, state, and zip code) into a
 * single String parameter. It uses split method of the String class to parse
 * the String into data members. Each field has accessor and mutator methods.
 * The toString method displays the 5 data members concatenated in mailing label
 * format. If the parameter String does not contain exactly 5 fields, then the
 * constructor would throw an IllegalMailingLabelException.
 * 
 * @author Patrick Mc Knew
 *
 */
public class MailingLabel implements Serializable {

}
