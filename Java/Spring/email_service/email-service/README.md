# Uber Coding Challenge Microserviço de Envio de E-mails com Amazon SES

Este projeto é um microserviço construído como parte do desafio da Uber, conforme especificado no [documento de desafio](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md). O objetivo principal deste microserviço é facilitar o envio básico de e-mails utilizando o serviço Amazon SES (Simple Email Service).

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Framework: Spring Boot
- Arquitetura: Arquitetura Limpa (Clean Architecture)

## Funcionalidades

- Envio de e-mails utilizando o Amazon SES.

## Configuração

1. Clone este repositório em sua máquina local, e altere para branch 'desafio_uber':

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git

git checkout desafio_uber
```

2. Abra o projeto em sua IDE de preferência, e altere as seguintes propriedades (chaves de acesso e secreta do seu usuário no AWS) no arquivo 'application.yml':

```bash
      access-key:
      secret-key:
```
3. Execute o projeto.

## Utilização
1. No seu navegador, acesse o [swagger](http://localhost:8080/swagger-ui.html) do projeto.
2. Clique no endpoint 'POST /email/send'.
3. Clique em 'Try it out'.
4. Preencha os campos 'from', 'to', 'subject' e 'body' com os dados do e-mail que deseja enviar.
5. Clique em 'Execute'.
6. Verifique se o e-mail foi enviado com sucesso.

## Configure seu usário no serviço Amazon SES
1. Antes de utilizar o serviço, configuere seu usuário no serviço da Amazon para que consigas aproveitar todas as funcionalidades do microserviço.
2. Caso não queiras utilizar o serviço de envio de e-mail da AWS, podes se sentir a vontada para trocar ou adicionar outro serviço de envio de e-mail da sua escolha.
3. Para tanto, basta criar as classes que implementarão o serviço e adicionar nos pacotes: 'controller', 'application' e 'adapters'.

## Contato
1. Linkedin: [Allyson Abreu](https://www.linkedin.com/in/allyson-de-abreu/)
2. E-mail: Clique [aqui](mailto:allysonabreu.dev@gmail.com) para me enviar um e-mail.