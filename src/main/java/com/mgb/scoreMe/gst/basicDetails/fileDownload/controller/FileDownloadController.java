package com.mgb.scoreMe.gst.basicDetails.fileDownload.controller;

import com.mgb.scoreMe.gst.basicDetails.fileDownload.model.JsonResponse;
import com.mgb.scoreMe.gst.basicDetails.fileDownload.model.JsonUrlRequest;
import com.mgb.scoreMe.gst.basicDetails.fileDownload.service.GSTFileDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileDownloadController {
    @Autowired
    GSTFileDownloadService fileDownloadService;

    @PostMapping("basic-gst-analysis-JSON")
    public JsonResponse getJsonFile(@RequestBody JsonUrlRequest urlRequest){
        System.out.println("inside getJson controller "+urlRequest);
        JsonResponse jsonResponse= fileDownloadService.getJsonResponseFromAPI(urlRequest.getJsonUrl());
        System.out.println("jsonResponse "+jsonResponse);
        return jsonResponse;
    }
}
