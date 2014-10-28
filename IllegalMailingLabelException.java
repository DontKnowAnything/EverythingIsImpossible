/**
 * Constructs message when exception is thrown
 * @author Patrick Mc Knew
 *
 */
public class IllegalMailingLabelException extends NoSuchFieldException{

	/**
	 * More detailed error
	 * @param s Message
	 */
	public IllegalMailingLabelException(String s) {
		super("Wrong fields"+s);
		
	}
	

}
