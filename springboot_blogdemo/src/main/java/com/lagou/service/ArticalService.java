package com.lagou.service;

import com.lagou.pojo.Artical;
import com.lagou.repository.ArticalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticalService {
    @Autowired
    private ArticalRepository articalRepository;

    /*public void findAll(){
        List<Artical> all = articalRepository.findAll();
        for (Artical artical : all) {
            System.out.println(artical);
        }

    }*/
}
