package com.mgb.scoreMe.gst.basicDetails.controller;

import com.mgb.scoreMe.gst.basicDetails.fileDownload.model.JsonResponse;
import com.mgb.scoreMe.gst.basicDetails.fileDownload.service.GSTFileDownloadService;
import com.mgb.scoreMe.gst.basicDetails.model.RefIdResponse;
import com.mgb.scoreMe.gst.basicDetails.model.UrlResponse;
import com.mgb.scoreMe.gst.basicDetails.service.RefIdGenerator;
import com.mgb.scoreMe.gst.basicDetails.service.UrlGenerator;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefIdGenController {
    @Autowired
    RefIdGenerator refIdGenerator;
    @Autowired
    UrlGenerator urlGenerator;
    @Autowired
    GSTFileDownloadService fileDownloadService;
    @PostMapping("/basic_GST_analysis")
    public JsonResponse getGSTBasicAnalysis(@RequestBody GSTINByPANRequest request){
        System.out.println("inside basic_GST_analysis controller");

        RefIdResponse refIdResponse=refIdGenerator.getGSTINByPANFromApi(request);
        System.out.println("refIdResponse "+refIdResponse.getData().getReferenceId());
        UrlResponse urlResponse=urlGenerator.getGSTINByPANFromApi(refIdResponse.getData().getReferenceId());
//        UrlResponse urlResponse=urlGenerator.getGSTINByPANFromApi("5c68d16d-af72-439c-a671-b6c4e710ba82");
        System.out.println("urlResponse "+urlResponse.getData().getJsonUrl());

        JsonResponse jsonResponse=fileDownloadService.getJsonResponseFromAPI(urlResponse.getData().getJsonUrl());
        return jsonResponse;

    }

}
