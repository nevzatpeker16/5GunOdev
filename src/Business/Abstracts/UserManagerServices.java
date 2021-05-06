package Business.Abstracts;

import Business.Concretes.SendMail;
import Core.Concretes.EmailToken;
import Entities.Concretes.*;

public interface UserManagerServices {
Boolean control(User user , EmailList EmailList);

void AddUser(User user , EmailToken EmailToken ,SendMail sendMail);
void updateUser(User user);
void deleteUser(User user);
}
