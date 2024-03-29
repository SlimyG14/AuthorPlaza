package com.zli.lb.authorplace.Controller;

import com.zli.lb.authorplace.DataObjects.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class StoryController {


    @GetMapping("/") // get maping for the login file
    public String requestEntries(Model model) {
        model.addAttribute("user", new User());
        return "login"; // return the user to the specified file
    }

    @PostMapping("/") // open the specified file
    public String checkUserInfo(@Valid User user, BindingResult bindingresult) {
        if (bindingresult.hasErrors()) {
            System.out.println("Controller: checkUserInfo(): Problem: "
                    + bindingresult.getErrorCount());
            return "login";
        }
        System.out.println("Controller: checkUserInfo(): "
                    + user.toString());
        return "welcome"; // redirect the user to the specified file
    }

}
