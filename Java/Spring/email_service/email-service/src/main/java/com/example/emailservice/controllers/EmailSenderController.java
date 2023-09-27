package com.example.emailservice.controllers;

import com.example.emailservice.application.EmailSenderService;
import com.example.emailservice.core.EmailRequest;
import com.example.emailservice.core.exceptions.EmailServiceException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailService) {
        this.emailSenderService = emailService;
    }

    @Operation(summary = "Send email", description = "Send email using Amazon SES")
    @ApiResponses(value = {
            @ApiResponse( responseCode = "200", description = "Email sent successfully",
                content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)))
    })
    @RequestMapping(value = "/api/email",
            consumes = "application/json",
            produces = "application/json",
            method = RequestMethod.POST)
    @PostMapping()
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        try{
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("Email sent successfully");
        } catch (EmailServiceException e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).body("Error while sending email");
        }
    }
}
