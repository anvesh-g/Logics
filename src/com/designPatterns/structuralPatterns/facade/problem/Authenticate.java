package com.designPatterns.structuralPatterns.facade.problem;

public class Authenticate {

    private boolean isValidUser;


    public boolean isValidUser() {
        return isValidUser;
    }

    public void setValidUser(boolean validUser) {
        isValidUser = validUser;
    }

    public Authenticate authenticate(String username,String password){
        if("anvesh".equalsIgnoreCase(username) && "1234".equalsIgnoreCase(password)){
            isValidUser=true;
            System.out.println("user authenticated");
        }else{
            isValidUser=false;
        }
        Authenticate auth=new Authenticate();
        auth.isValidUser=true;
        return auth;
    }
}
