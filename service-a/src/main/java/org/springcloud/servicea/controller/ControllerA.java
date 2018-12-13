package org.springcloud.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {

    @ResponseBody
    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public String a() {
        return "a";
    }

}
