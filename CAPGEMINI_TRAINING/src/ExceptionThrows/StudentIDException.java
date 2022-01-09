package ExceptionThrows;

public class StudentIDException extends Exception {
	
	private String message;

	public StudentIDException(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}
}
