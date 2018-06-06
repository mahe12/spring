package com.karafboot.controllers;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Begin Samuel
 */

@RestController
@RequestMapping("/simple")
public class KarafSpringbootRestController {

    private static final Logger log = LoggerFactory.getLogger(KarafSpringbootRestController.class);

    private RestTemplate restTemplate;

    @RequestMapping(value = "/restkaraf", method = RequestMethod.GET)
    public String getdetails() {
        log.info("karaf springboot :::::: ");
        return "karaf springboot how to run";
    }


}
