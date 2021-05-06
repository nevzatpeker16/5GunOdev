package Entities.Concretes;

import Entities.Abstracts.EmailListDao;

import java.util.ArrayList;
import java.util.List;
public class EmailList implements EmailListDao {

	private List<String> emailList = new ArrayList<String>();
	
	public void EmailAdd(User user) {
		
		emailList.add(user.geteMail());
		
	}
	
	public boolean EmailControl(User user) {
		
		if(emailList.contains(user.geteMail())) {
			
			return true;
			
		}
		
		else return false;
	
	}
	
}
