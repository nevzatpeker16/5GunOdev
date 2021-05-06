package Business.Concretes;
import Business.Abstracts.LoginControlServices;
import DataAccesses.Concretes.UserFolder.UserAcceses;

public class LoginControl implements LoginControlServices {

	@Override
	public boolean loginControl(UserAcceses UserAccesses, String Username , String Password) {
		return true;
	}


	

	
}
