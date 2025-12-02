package br.com.rpa.whatsapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WhatsAppBot {

    private final WebDriver driver;
    private final MessageService messageService;

    public WhatsAppBot(WebDriver driver) {
        this.driver = driver;
        this.messageService = new MessageService();
    }

    public void start() throws InterruptedException {
        driver.get("https://web.whatsapp.com/");
        LoggerService.log("Aguardando login no WhatsApp Web...");
        Thread.sleep(15000);

        while (true) {
            try {
                monitorUnreadMessages();
                Thread.sleep(3000);
            } catch (Exception e) {
                LoggerService.log("Erro no loop principal: " + e.getMessage());
            }
        }
    }

    private void monitorUnreadMessages() {
        List<WebElement> unreadChats = driver.findElements(
            By.xpath("//span[@aria-label=' mensagem não lida ']//ancestor::div[@role='row']")
        );

        if (unreadChats.isEmpty()) {
            LoggerService.log("Nenhuma nova mensagem...");
            return;
        }

        for (WebElement chat : unreadChats) {
            chat.click();
            LoggerService.log("Entrou no chat com nova mensagem.");
            answer();
        }
    }

    private void answer() {
        String autoReply = "Olá! Esta é uma resposta automática enviada por um RPA em Java 🤖. Já retorno!";
        messageService.sendAutoReply(driver, autoReply);
    }
}
