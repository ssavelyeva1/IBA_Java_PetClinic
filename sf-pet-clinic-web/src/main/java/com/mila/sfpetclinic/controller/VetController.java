package com.mila.sfpetclinic.controller;

import com.mila.sfpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "vets/index", "/vets/index.html","/vets.html"})
    public String listVets(Model model) {
        model.addAttribute ("vets", vetService.findAll());
        return "vets/index";
    }
//    @RequestMapping({"/find","/oups"})
//    public String findVets() {
//        return "/notimplemented";
//    }
}
