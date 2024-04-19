package com.TwilioSMS.Controller;

import com.TwilioSMS.Payload.SmsRequestDTO;
import com.TwilioSMS.Service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    private final SmsService twilioSmsService;

    @Autowired
    public SmsController(SmsService twilioSmsService) {
        this.twilioSmsService = twilioSmsService;
    }

    //       http://localhost:8080/send-sms
    @PostMapping("/send-sms")
    public ResponseEntity<String> sendSms(@RequestBody SmsRequestDTO smsRequestDTO) {
        twilioSmsService.sendSms(smsRequestDTO.getTo(), smsRequestDTO.getMessage());

        return ResponseEntity.ok("Message sent successfully");
    }
}


