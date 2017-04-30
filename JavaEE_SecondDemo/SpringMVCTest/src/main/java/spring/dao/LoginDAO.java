package spring.dao;
import spring.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}