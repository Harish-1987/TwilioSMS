package com.TwilioSMS.Payload;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SmsRequestDTO {

    private String to;
    private String message;

    // Getters and setters

    public String getTo(){
        return to;
    }

    public String getMessage(){
        return message;
    }


}
