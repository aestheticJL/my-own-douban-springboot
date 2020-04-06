package com.mmt.myowndoubanspringboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void getJson() {
        String url = "http://api.douban.com/v2/movie/subject/27062638?apikey=0df993c66c0c636e29ecbb5344252a4a";
        //String json =restTemplate.getForObject(url,Object.class);
        ResponseEntity<String> results = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String json = results.getBody();
        System.out.println(json);
    }

}
