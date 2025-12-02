package br.com.rpa.whatsapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MessageService {

    public void sendAutoReply(WebDriver driver, String reply) {
        try {
            WebElement inputBox = driver.findElement(By.xpath("//div[@title='Mensagem']"));
            inputBox.click();
            inputBox.sendKeys(reply);
            inputBox.sendKeys(Keys.ENTER);

            LoggerService.log("Mensagem enviada: " + reply);
        } catch (Exception e) {
            LoggerService.log("Erro ao enviar mensagem: " + e.getMessage());
        }
    }
}
