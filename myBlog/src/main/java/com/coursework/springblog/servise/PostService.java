package com.coursework.springblog.servise;

import com.coursework.springblog.entities.Post;
import com.coursework.springblog.repositories.PostRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService
{
    @Autowired
    private PostRepositories postRepositories;

    public List<Post> getALlPosts()
    {
        return postRepositories.findAll();
    }
    public void insert(Post post)
    {
        postRepositories.save(post);
    }
}
