package com.example.tp;

public class MainUser {
    public static void main(String[] args) {
        User[] users = {
            new User("AMINE", 20),   
            new User("", 32),       
            new User("KARIMA", 17) 
        };

        for (User u : users) {
            try {
                u.validate();
                System.out.println("Utilisateur validé : " + u);
            } catch (InvalidUserException e) {
                System.err.println("Validation échouée : " + e.getMessage());
                LoggerUtil.logError("Échec de validation pour " + u, e);
            }
        }
    }
}