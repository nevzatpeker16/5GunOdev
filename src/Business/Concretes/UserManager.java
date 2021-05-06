package Business.Concretes;

import Business.Abstracts.UserManagerServices;
import Core.Concretes.EmailToken;
import Core.Concretes.Messages;
import Entities.Concretes.EmailList;
import Entities.Concretes.User;
public class UserManager implements UserManagerServices {
	
	private Boolean _Control;
	@Override
	public Boolean control(User user, EmailList EmailList) {
	
if(EmailValidation.isEmailValid(user)) {
		
		if(EmailList.EmailControl(user)) {
			
			if (user.getPassword().length() >= 6) {
				if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
					
					System.out.println(Messages.basarili);
					_Control =true;
				}
				else { System.out.println(Messages.karakterHatasi); _Control = false;}
			}
			else {System.out.println(Messages.parolaHatasi); _Control = false;}
		}
		else {System.out.println(Messages.emailFormatHatasi); _Control = false;}
	}
	
return _Control;
	
		}
	
	@Override
	public void AddUser(User user , EmailToken EmailToken , SendMail sendMail) {
		
		if(EmailToken.getToken() == sendMail.getMailToken()) {
	
		user.setID(0);
		user.setFirstName(null);
		user.setLastName(null);
		user.seteMail(null);
		user.setPassword(null);
	}
		else System.out.println(Messages.emailOnayla);
	}
	@Override
	public void updateUser(User user) {
		user.setID(0);
		user.setFirstName(null);
		user.setLastName(null);
		user.seteMail(null);
		user.setPassword(null);
		
	}
	@Override
	public void deleteUser(User user) {
		user.setID(0);
		user.setFirstName(null);
		user.setLastName(null);
		user.seteMail(null);
		user.setPassword(null);
		
	}
	
	
	
	
		
	}


	
	

