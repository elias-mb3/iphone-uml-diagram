package main.java.iphone.app;

import main.java.iphone.model.IPhone;

public class Main {
    public static void main(String[] args) {
        // Instanciando o iPhone
        IPhone iphone = new IPhone();
        
        System.out.println("======= iPhone Demonstration =======");
        
        // Demonstrando funcionalidades do Music Player
        System.out.println("\n----- Music Player Features -----");
        try {
            iphone.selectMusic("One - Metallica");
            iphone.play();
            System.out.println("Listening to music for 5 seconds...");
            Thread.sleep(1000);
            iphone.pause();
            iphone.selectMusic("Chop Suey - System of a Down");
            iphone.play();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Demonstrando funcionalidades do navegador de internet
        System.out.println("\n----- Internet Browser Features -----");
        try {
            iphone.addNewTab();
            iphone.displayPage("https://www.google.com");
            System.out.println("Browsing the page...");
            Thread.sleep(1000);
            iphone.refreshPage();
            iphone.addNewTab();
            iphone.displayPage("https://www.apple.com");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Demonstrando funcionalidades de telefone
        System.out.println("\n----- Phone Features -----");
        try {
            iphone.call("11987654321");
            System.out.println("Call in progress...");
            Thread.sleep(1000);
            System.out.println("Ending current call.");
            
            System.out.println("\nReceiving an incoming call...");
            Thread.sleep(500);
            iphone.answer();
            
            System.out.println("\nChecking messages...");
            iphone.startVoicemail();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\n======= Demonstration Completed =======");
    }
}
