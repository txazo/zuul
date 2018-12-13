package org.springcloud.serviceb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerB {

    @ResponseBody
    @RequestMapping(value = "/b", method = RequestMethod.GET)
    public String b() {
        return "b";
    }

}
