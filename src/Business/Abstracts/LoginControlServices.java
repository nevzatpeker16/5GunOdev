package Business.Abstracts;


import DataAccesses.Concretes.UserFolder.UserAcceses;


public interface LoginControlServices {

	abstract boolean loginControl(UserAcceses UserAccesses , String Username, String Password);
}
