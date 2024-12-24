package movie_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//If this exception gets fired, send the status: 404
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException{
	private int invalidId;
	public MovieNotFoundException(String errorMessage, int invalidId) {
		super(errorMessage);
		this.invalidId = invalidId;
	}
	
	@Override
	public String getMessage() {
		String errorMessage = super.getMessage();
		String finalMessage = errorMessage + " => " + invalidId;
		return finalMessage;
	}
}



