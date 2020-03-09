package Exception;

public class AccountException extends Exception{

	String msg;
	public AccountException(String msg)
	{
		this.msg = msg;
	}
	@Override
	public String getMessage()
	{
		return this.msg;
	}
}
