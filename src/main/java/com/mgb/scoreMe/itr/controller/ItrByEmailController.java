package com.mgb.scoreMe.itr.controller;

import com.mgb.scoreMe.itr.refId.model.ItrEmailRequest;
import com.mgb.scoreMe.itr.refId.model.ItrEmailResponse;
import com.mgb.scoreMe.itr.refId.service.ItrRefIdGenService;
import com.mgb.scoreMe.itr.url.model.ItrUrlResponse;
import com.mgb.scoreMe.itr.url.service.ItrUrlGenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItrByEmailController {
    @Autowired
    ItrRefIdGenService refIdGenService;
    @Autowired
    ItrUrlGenService urlGenService;
    @PostMapping("/itr-email-refId")
    public ItrEmailResponse getItrByEmail(@RequestBody  ItrEmailRequest emailRequest){
        System.out.println("inside getItrByEmail controller "+emailRequest.getEmail()+" ** "+emailRequest.getNotificationEmail());

        return refIdGenService.getItrRefIdByEmail(emailRequest);
//return null;
//        ItrUrlResponse itrUrlResponse=urlGenService.getItrUrlByRefId("4a4084df-c476-4b38-a0dd-54ebb35f66ba");
//        System.out.println("itrUrlResponse "+itrUrlResponse);
//        return itrUrlResponse;

    }


    @PostMapping("/itr-email-url/{referenceId}")
    public ItrUrlResponse getItrUrlByRefId(@PathVariable String referenceId){
        System.out.println("inside getItrUrlByRefId referenceId "+referenceId);
        ItrUrlResponse itrUrlResponse=urlGenService.getItrUrlByRefId(referenceId);
        System.out.println("itrUrlResponse "+itrUrlResponse);
        return itrUrlResponse;
    }
}
