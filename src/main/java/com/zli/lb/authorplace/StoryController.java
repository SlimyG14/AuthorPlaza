package com.zli.lb.authorplace;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StoryController {


    @GetMapping("/login")
    public String requestEntries(Model model) {
        return "/welcome";
    }

    @PostMapping("/entries")
    public String saveEntries(@ModelAttribute Entry entries) {
        entries.setName(entries.getName());
        return "redirect:/entries";
    }

}
