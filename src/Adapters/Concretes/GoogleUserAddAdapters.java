package Adapters.Concretes;
import Adapters.Abstracts.*;
import Entities.Concretes.User;
import GoogleUserAdd.*;
public class GoogleUserAddAdapters implements GoogleUserAddAdaptersDao  {
	@Override
	public void addUserFromGoogle(User user) {
		System.out.println("Kullanıcı eklendi.");
	}
}
