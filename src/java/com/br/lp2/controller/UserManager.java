package com.br.lp2.controller;

import com.br.lp2.model.User;
import com.br.lp2.model.dao.UserDAO;

/**
 *
 * @author 1147106
 */
public class UserManager {
    
    /**
     * 
     * @param username USERNAME
     * @param password PASSWORD
     * @return -1 for "User not found" -2 for "Wrong Password" 1 for "User authorized"
     */
    public static int authorize(String username, String password){
        int auth = -1;
        UserDAO dao = new UserDAO();
        User user = dao.readByUsername(username);
        if(user.getId_user() == -1){
            System.out.println("Error: User not found");
            auth = -1;
        } else if(!user.getPassword().equals(password)){
            System.out.println("Error: Wrong passsword");
            auth = -2;
        } else {
            auth = 1;
        }
        return auth;
    }
    
    public static int insert(User user, String pwd2){
        UserDAO dao = new UserDAO();
        
        if( dao.readByUsername(user.getUsername()).getId_user() != -1 ){
            System.out.println("Error: username already used");
            return -3;
        }    
        if(user.getPassword().equals(pwd2)){
            boolean inserted = dao.insert(user);
            if(inserted) {
                System.out.println("User "+user.getUsername()+" inserted successfully" );
                return 1;
            }
            else {
                System.out.println("Error: user not inserted");
                return -5;
            }
        } else {
            System.out.println("Error: Password doesn't match");
            return -4;
        }
        
        
        
    }
    
    
}
