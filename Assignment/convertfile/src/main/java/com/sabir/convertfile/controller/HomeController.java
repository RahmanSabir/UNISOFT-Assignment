package com.sabir.convertfile.controller;

import com.sabir.convertfile.service.TextUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private TextUploadService textUploadService ;
    @GetMapping("home")
    public String home(Model model)
    {
        model.addAttribute("text",textUploadService.getAll());
        return "index.html";
    }

    @GetMapping("text/upload")
    public String textupload()
    {
        return "textup.html";
    }
}
