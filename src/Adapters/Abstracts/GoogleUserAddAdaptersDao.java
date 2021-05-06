package Adapters.Abstracts;

import Entities.Concretes.User;

public interface GoogleUserAddAdaptersDao {
        abstract void addUserFromGoogle(User user);
}
