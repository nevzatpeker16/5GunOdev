package Business.Concretes;
import Business.Abstracts.SendVerificationMailServices;
import Core.Concretes.Messages;

public class SendMail implements SendVerificationMailServices {

	private String MailToken;
	@Override
	public void sendMail() {
	System.out.println(Messages.emailGonderildi);
		
	}
	public String getMailToken() {
		return MailToken;
	}
	public void setMailToken(String mailToken) {
		MailToken = mailToken;
	}
	
	
	
}
