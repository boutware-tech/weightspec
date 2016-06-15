package org.boutwaretech.weightspec.controllers;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Profile(Profiles.BASIC_AUTH)
@Controller
public class BasicAuthController {

    @RequestMapping("/login")
    String login() {
        return "login";
    }
}
