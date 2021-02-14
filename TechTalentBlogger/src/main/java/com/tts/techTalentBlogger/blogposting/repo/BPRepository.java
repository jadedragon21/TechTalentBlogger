package com.tts.techTalentBlogger.blogposting.repo;

import com.tts.techTalentBlogger.blogposting.model.BlogPost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BPRepository extends CrudRepository<BlogPost, Long> {

    @Query(value = "SELECT * from BLOG_POST where TITLE LIKE ?1 OR AUTHOR LIKE ?1 OR BLOG_ENTRY LIKE ?1", nativeQuery = true)
    public List<BlogPost> search(String keyword);

}
