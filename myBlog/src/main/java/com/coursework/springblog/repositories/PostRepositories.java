package com.coursework.springblog.repositories;

import com.coursework.springblog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepositories extends JpaRepository<Post ,Long>
{

}
