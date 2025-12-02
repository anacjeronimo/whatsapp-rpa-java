# ☕💬 RPA WhatsApp Web em Java
Automação completa usando Java + Selenium WebDriver para detectar mensagens não lidas no WhatsApp Web e responder automaticamente.

## 🎯 Objetivo do Projeto

O objetivo deste projeto é demonstrar um RPA em Java capaz de automatizar o WhatsApp Web, detectando mensagens não lidas e enviando respostas automáticas de forma simples e eficiente.


## 🤖 Como funciona?
- WebDriverFactory
Configura o Selenium + ChromeDriver.

- WhatsAppBot

- Abre o WhatsApp Web

- Aguarda login via QR Code

- Faz loop contínuo em busca de mensagens não lidas

- MessageService

- Localiza a caixa de entrada

- Escreve e envia a resposta automática

- LoggerService
Registra toda a execução no console.

- Main
Inicializa o robô.

## 💻 Tecnologias utilizadas:

- Java 8+

- Selenium WebDriver

- ChromeDriver

- XPath (localização de elementos)

- Maven

## ⚙️ Instalação e Configuração
**1️⃣ Instale o Java e o Maven**
```bash
java -version
mvn -version
```
**2️⃣ Instale o Chrome e baixe o ChromeDriver**

https://googlechromelabs.github.io/chrome-for-testing/

⚠ O ChromeDriver deve ser da mesma versão do seu Google Chrome.

**3️⃣ Adicione o ChromeDriver ao PATH**

Exemplo Windows:
```bash
C:\webdriver\chromedriver.exe
```
## ▶️ Rodando o Bot
**1. Compile o projeto**
```bash
mvn clean package
```
**2. Execute o .jar**
```bash
java -jar target/whatsapp-rpa-java.jar
```
**3. Aguarde o QR Code**

O bot irá:

- Abrir o WhatsApp Web

- Esperar você escanear

- Detectar mensagens não lidas

- Responder automaticamente

## 💬 Mensagem automática padrão

O bot envia a seguinte resposta:
```bash
Olá! Esta é uma resposta automática enviada por um RPA em Java 🤖. Já retorno!
```
Você pode alterar a mensagem dentro do arquivo:
```bash
WhatsAppBot.java
```
## 🧪 Funcionamento interno
**🔍 Localizando chats com mensagens não lidas**
```bash
List<WebElement> unreadChats = driver.findElements(
    By.xpath("//span[@aria-label=' mensagem não lida ']//ancestor::div[@role='row']")
);
```
**✉ Enviando mensagem automática**
```bash
WebElement inputBox = driver.findElement(By.xpath("//div[@title='Mensagem']"));
inputBox.click();
inputBox.sendKeys(reply);
inputBox.sendKeys(Keys.ENTER);
```
## ⚠ Aviso Importante

Este projeto é **exclusivamente educacional!**

Automatizar WhatsApp Web pode:

- Violar os **termos de uso** do WhatsApp

- Levar a **bloqueio da conta** se usado indevidamente

Ser usado somente para **estudos e testes pessoais.**
## ✏️ Autor

Desenvolvido por [Ana Carolina Jerônimo](https://github.com/anacjeronimo) 🦇

















