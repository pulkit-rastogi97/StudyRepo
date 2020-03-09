package Exception;

public class VoterException extends Exception{

	String message;
	
	public VoterException(String message)
	{
		this.message=message;
	}
	@Override
	public String toString()
	{
		return this.message;
	}
}
