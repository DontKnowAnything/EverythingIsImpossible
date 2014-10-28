import java.io.Serializable;

/**
 * This class represents a mailing label. It implements the serializable
 * interface. Its data members (name, address, city, state, and zip code) are
 * stored as Strings. The constructor accepts a single String parameter, which
 * contains each field separated by comma. It uses split method of the String
 * class to parse the parameter into data members. Each field has accessor and
 * mutator methods. The toString method displays the 5 data members concatenated
 * in mailing label format. If the parameter String does not contain exactly 5
 * fields, then the constructor would throw an IllegalMailingLabelException.
 * 
 * @author Patrick Mc Knew
 *
 */
public class MailingLabel implements Serializable 
{
	String name;
	String address;
	String city;
	String state;
	String zip;

	/**
	 * 
	 * @param p
	 * @throws IllegalMailingLabelException If the parameter does not have 5 fields
	 */
	public MailingLabel(String p) throws IllegalMailingLabelException {
		//p+=name+","+address+city+state+zip;
	}

}
