package com.lyoyang.springbootelasticsearch.repository;


import com.lyoyang.springbootelasticsearch.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BlogRepository extends ElasticsearchRepository<Blog,String> {

    Blog findByTitle(String title);

    List<Blog> findByTitleLike(String title);

    Page<Blog> findByTitleLikeOrContentLike(String title, String content, Pageable pageable);
}
