package com.mmt.myowndoubanspringboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringRestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testGetApi/{id}")
    public String getJson(@PathVariable String id) {
        String url = "http://api.douban.com/v2/movie/subject/"+id+"?apikey=0df993c66c0c636e29ecbb5344252a4a";
        //String json =restTemplate.getForObject(url,Object.class);
        ResponseEntity<String> results = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String json = results.getBody();
        return json;
    }
}