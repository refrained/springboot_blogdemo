package com.lagou.repository;

import com.lagou.pojo.Artical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticalRepository extends JpaRepository<Artical, Integer> {



}
