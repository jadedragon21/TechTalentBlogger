package com.tts.techTalentBlogger.blogposting.service;

import com.tts.techTalentBlogger.blogposting.model.BlogPost;
import com.tts.techTalentBlogger.blogposting.repo.BPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BPService {

    @Autowired
    private BPRepository repo;
    //adds to the blogpost and saves it
    public void addBlogPost(BlogPost blogPost){
        repo.save(blogPost);
    }
    //list and find all the blog posts
    public List<BlogPost> listAll() {return (List<BlogPost>)repo.findAll();}
    //searches the blogposts for keywords and returns the keywords
    public List<BlogPost> searchByKeyword(String keyword){
        return repo.search(keyword);
    }
    //looks up later what this does-think it looks for an id and then returns the id number
    public Optional<BlogPost> findById(Long id) {return repo.findById(id);}
    //duh deletes the long (maybe extra)
//    public void deleteBlogPost(Long id) {return repo.findById(id).get();}
    public void deleteBlogPost(Long id){
        repo.deleteById(id);
    }
}
