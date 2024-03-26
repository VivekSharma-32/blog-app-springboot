package com.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blog.entities.Category;
import com.blog.entities.Post;
import com.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);

    List<Post> findByCategory(Category category);

    @Query("SELECT p FROM Post p where p.title LIKE :key")
    List<Post> searchByTitle(@Param("key") String title);

}
