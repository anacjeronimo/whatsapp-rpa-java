package br.com.rpa.whatsapp;

import org.openqa.selenium.WebDriver;

public class Main {

    public static void main(String[] args) throws Exception {
        WebDriver driver = WebDriverFactory.createDriver();
        WhatsAppBot bot = new WhatsAppBot(driver);
        bot.start();
    }
}
