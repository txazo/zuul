package org.springcloud.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ControllerA {

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Object index() {
        Map<String, Object> data = new HashMap<>();
        data.put("code", 200);
        data.put("data", "service-a");
        return data;
    }

}
