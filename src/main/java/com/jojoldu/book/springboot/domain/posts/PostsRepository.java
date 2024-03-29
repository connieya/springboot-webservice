package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
// Database를 접근하게 해줄 JpaRepository
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("select p from Posts p order by p.id desc")
    List<Posts> findAllDesc();
}
