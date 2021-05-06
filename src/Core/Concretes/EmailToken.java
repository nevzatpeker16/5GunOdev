package Core.Concretes;
import Core.Abstracts.*;
public class EmailToken implements EmailTokenDao{

	private String Token;

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}
	
	
}
