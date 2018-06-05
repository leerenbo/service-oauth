package com.yibaijin.service.boot.web.controller.auth;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("auth/")
@Api
public class AuthController {
    @RequestMapping("authorize")
    public ModelAndView authorize() {
        return null;
    }

    @RequestMapping("token")
    public String token() {
        return null;
    }

    @RequestMapping("introspect")
    public String introspect() {
        return null;
    }

    @RequestMapping("revoke")
    public String revoke() {
        return null;
    }
}
