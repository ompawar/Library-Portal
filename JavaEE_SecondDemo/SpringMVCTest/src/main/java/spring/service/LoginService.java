package spring.service;

import spring.model.*;

public interface LoginService{    
       public boolean checkLogin(String userName, String userPassword);
}