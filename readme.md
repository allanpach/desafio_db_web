# Test Web com Selenium WebDriver

Este é o projeto de Testes Web automatizado.

##  Requisitos
 * Java 8+ JDK deve estar instalado
 * Maven deve estar instalado e configurado no path da aplicação
 * Pasta raiz mapeada contendo Chromedriver.exe e/ou GeckoDriver no path do sistema.
 * Como configurar o path: https://www.linkedin.com/pulse/como-instalar-o-chromedriver-windows-10-jo%C3%A3o-gross/?originalSubdomain=pt
 * Para vizualizar os relatórios indico o Alluer report baixe e mapeia no path do sistema.
 
##  Aplicação usada para  os testes
  * Alguns cenário podem aprsentar falhas devido ao Recaptch

## Como executar a aplicação 

Na raiz do projeto, através de seu Prompt de Commando/Terminal/Console execute o comando 

```bash
mvn clean test
```
## Reports
 * O report da execução dos testes fica na raiz do projeto em: /DesafioApiDb/target/surefire-reports
 * Pode ser usado uma ferramenta para ler os logs conforme escolha.
 * Exemplo do Allure, abra o CMD e digita: allure serve C:\Users\UserTest\eclipse-workspace\DesafioApiDb\target\surefire-reports



