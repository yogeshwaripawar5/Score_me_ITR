package com.mgb.scoreMe.itr.refId.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItrEmail {
    String email;
String notificationEmail;
    public ItrEmail(String email,String notificationEmail)
    {
        this.email = email;
        this.notificationEmail=notificationEmail;
    }
}
