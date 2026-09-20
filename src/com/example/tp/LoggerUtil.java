package com.example.tp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerUtil {
    private static final String LOG_FILE = "error.log";
    public static void logError(String message, Exception e) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println("[" + LocalDateTime.now() + "] ERREUR: " + message);
            if (e != null) {
                e.printStackTrace(pw);
            }
            pw.println("-----------");
        } catch (IOException ex) {
            System.err.println("Impossible d'écrire dans le fichier de log : " + ex.getMessage());
        }
    }
}