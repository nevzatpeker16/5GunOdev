package Entities.Abstracts;

import Entities.Concretes.*;

public interface EmailListDao {

	boolean EmailControl(User user);
	void EmailAdd(User user);

}
