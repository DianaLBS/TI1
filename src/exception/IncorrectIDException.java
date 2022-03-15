package exception;

public class IncorrectIDException extends Exception{
	public IncorrectIDException(){
		super("THE USER ISN'T REGISTERED");
	}
}

