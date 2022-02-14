package com.coursework.springblog.controllers;

import com.coursework.springblog.entities.Post;
import com.coursework.springblog.servise.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class BlogController
{
    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/posts")
    public List<Post> posts()
    {
        return postService.getALlPosts();
    }

    @PostMapping("/post")
    public void publishPost(@RequestBody Post post)
    {
        if (post.getDateCreated() == null)
            post.setDateCreated(new Date());
        postService.insert(post);
    }
}
