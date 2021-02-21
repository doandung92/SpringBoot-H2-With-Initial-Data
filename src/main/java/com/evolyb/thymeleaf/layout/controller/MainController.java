package com.evolyb.thymeleaf.layout.controller;

import com.evolyb.thymeleaf.layout.repository.*;
import lombok.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class MainController {
    private final UserRepository userRepository;

    @GetMapping
    public String index(Model model){
        model.addAttribute("numbers", userRepository.findAll().size());
        return "index";
    }
}
