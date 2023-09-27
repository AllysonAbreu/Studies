# Uber Coding Challenge Email Sending Microservice with Amazon SES

This project is a microservice built as part of the Uber challenge, as specified in the [challenge document](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md). 
The main objective of this microservice is to facilitate basic email sending using the Amazon SES (Simple Email Service).

## Technologies Used

- Programming Language: Java
- Framework: Spring Boot
- Architecture: Clean Architecture

## Features

- Envio de e-mails utilizando o Amazon SES.

## Setup

1. Clone this repository to your local machine and switch to the 'desafio_uber' branch:

```bash
git clone https://github.com/AllysonAbreu/Studies.git

git checkout desafio_uber
```

2. Open the project in your preferred IDE and update the following properties (AWS access and secret keys) in the 'application.yml' file:

```bash
      access-key:
      secret-key:
```

3. Open the package 'infra.ses', on SesEmailSender class, and update the 'from' field with the email you want to use to send the emails. Remember, this email must be verified in the Amazon SES service.

```bash
    private final String from = "your_email";
```

4. Run the project.

## How to use
1. In your web browser, access the project's [swagger](http://localhost:8080/swagger-ui/index.html).
2. Click on the 'POST /api/email' endpoint.
3. Click in 'Try it out'.
4. Fill in the 'to', 'subject', and 'body' fields with the email data you want to send.
5. Click on 'Execute'.
6. Verify if the email was sent successfully.

## Configure seu usário no serviço Amazon SES
1. Before using the service, configure your user in the Amazon service so you can take advantage of all the microservice's functionalities.
2. If you do not want to use the AWS email sending service, feel free to replace or add another email sending service of your choice.
3. To do so, simply create the classes that will implement the service and add them to the 'controller', 'application', and 'adapters' packages.

## Contato
1. Linkedin: [Allyson Abreu](https://www.linkedin.com/in/allyson-de-abreu/)
2. E-mail: Click [here](mailto:allysonabreu.dev@gmail.com) to send me an e-mail.