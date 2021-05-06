package Business.Concretes;

import Business.Abstracts.EmailValidationServices;
import Entities.Concretes.*;

import java.util.regex.*;
public class EmailValidation implements EmailValidationServices {
		private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		public static boolean isEmailValid(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
		Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.geteMail()).find();
		
		
		}
	}


