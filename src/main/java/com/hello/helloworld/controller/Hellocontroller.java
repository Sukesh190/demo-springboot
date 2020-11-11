package com.hello.helloworld.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping(value = "/hello")
    public String helloWorld() {
        String hello = "";
        try {
            hello = new JSONObject().put("body", "Hello World").toString();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return hello;
    }
}
