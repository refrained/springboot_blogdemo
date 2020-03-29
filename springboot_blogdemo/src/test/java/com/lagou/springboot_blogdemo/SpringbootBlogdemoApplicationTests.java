package com.lagou.springboot_blogdemo;

import com.lagou.pojo.Artical;
import com.lagou.repository.ArticalRepository;
import com.lagou.service.ArticalService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootBlogdemoApplicationTests {

    @Autowired
    private ArticalRepository articalRepository;

    @Test
    public void contextLoads() {
        List<Artical> all = articalRepository.findAll();
        for (Artical artical : all) {
            System.out.println(artical);
        }
    }

    @Test
    public void findAllPage(){
        int page=0,size=3;
        Pageable pageable = PageRequest.of(page,size);
        Page<Artical> all1 = articalRepository.findAll(pageable);
        System.out.println(all1.getNumber());
        System.out.println(all1.getTotalElements());
        System.out.println(all1.getTotalPages());
        System.out.println(all1.hasPrevious());
        System.out.println(all1.hasNext());
        for (Artical artical : all1) {
            System.out.println(artical);
        }
    }

    @Test
    public void findById() {
        Optional<Artical> byId = articalRepository.findById(3);
        if(byId.isPresent()){
            System.out.println(byId.get());
        }

    }

}
