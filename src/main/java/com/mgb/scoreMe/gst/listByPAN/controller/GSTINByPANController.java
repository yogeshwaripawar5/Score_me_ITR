package com.mgb.scoreMe.gst.listByPAN.controller;

import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANRequest;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANResponse;
import com.mgb.scoreMe.gst.listByPAN.service.GSTINByPANService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GST")
public class GSTINByPANController {
    @Autowired
    GSTINByPANService gstinByPANService;

    @PostMapping("/GSTINByPAN")
public GSTINByPANResponse getGSTINByPAN(@RequestBody GSTINByPANRequest request){
        return gstinByPANService.getGSTINByPANFromApi(request);
    }
}
