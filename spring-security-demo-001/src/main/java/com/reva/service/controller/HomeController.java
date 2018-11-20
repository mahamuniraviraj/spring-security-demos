

package com.reva.service.controller;


import java.security.Principal;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Raviraj S Mahamuni
 * @date 19-Nov-2018
 * @since 1.0
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String myHome(ModelMap model, Principal principal) {

        String user = principal == null ? "User " : principal.getName();
        model.put("userName", user);

        Object principalFromHolder = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        String username = null;

        if (principalFromHolder instanceof UserDetails) {
            username = ((UserDetails) principalFromHolder).getUsername();
            System.out.println("UserDetails " + username);
        } else {
            username = principalFromHolder.toString();
            System.out.println("principal " + username);
        }

        return "home";
    }

    @RequestMapping("/myApi")
    public String myApi(ModelMap model) {

        model.put("userName",
                "We have skipped authentication. Enter Password that ends with 123 for any user to get successfuly authenticate the user.");

        return "skipedAuth";
    }

}
