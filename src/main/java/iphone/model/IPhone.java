// Arquivo: main/java/iphone/model/IPhone.java
package main.java.iphone.model;

import main.java.iphone.interfaces.InternetBrowser;
import main.java.iphone.interfaces.MusicPlayer;
import main.java.iphone.interfaces.Phone;

public class IPhone implements MusicPlayer, InternetBrowser, Phone {

    // MusicPlayer
    public void play() {
        System.out.println("Playing music...");
    }

    public void pause() {
        System.out.println("Pausing music...");
    }
    
    public void selectMusic(String music) {
        if (music == null || music.trim().isEmpty()) {
            throw new IllegalArgumentException("Music name cannot be null or empty.");
        }
        System.out.println("Selected music: " + music);
    }

    // InternetBrowser
    public void displayPage(String url) {
        if (url == null || url.trim().isEmpty()) {
            throw new IllegalArgumentException("URL cannot be null or empty.");
        }
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            throw new IllegalArgumentException("Invalid URL. Must start with http:// or https://");
        }
        System.out.println("Displaying page: " + url);
    }

    public void addNewTab() {
        System.out.println("Adding a new browser tab...");
    }

    public void refreshPage() {
        System.out.println("Refreshing the current page...");
    }

    // Phone
    public void call(String number) {
        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty.");
        }
        if (!number.matches("\\d{8,15}")) {
            throw new IllegalArgumentException("Invalid phone number. Must contain only digits (8 to 15 characters).");
        }
        System.out.println("Calling: " + number);
    }

    public void answer() {
        System.out.println("Answering incoming call...");
    }

    public void startVoicemail() {
        System.out.println("Accessing voicemail...");
    }
}