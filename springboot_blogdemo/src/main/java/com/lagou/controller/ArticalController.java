package com.lagou.controller;

import com.lagou.pojo.Artical;
import com.lagou.repository.ArticalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ArticalController {

    @Autowired
    private ArticalRepository articalRepository;

    @RequestMapping("/")
    public String toIndex(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(Model model, @RequestParam(required = false,defaultValue = "0") int page, @RequestParam(required = false,defaultValue = "3")int size){

        Pageable pageable = PageRequest.of(page,size);
        Page<Artical> pages = articalRepository.findAll(pageable);
        model.addAttribute("page",pages);
        return "client/index";
    }
}
