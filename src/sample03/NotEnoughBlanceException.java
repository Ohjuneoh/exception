package sample03;

public class NotEnoughBlanceException extends BankingException{
	
	public NotEnoughBlanceException(String message) {
		super(message);
	}

}
