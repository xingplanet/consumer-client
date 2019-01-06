package com.xingplanet.consumer.consumerclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public String consumer(){
        Map m = new HashMap();
        return restTemplate.getForEntity("http://SPRINGTEST/hello",String.class).getBody();
    }
}
