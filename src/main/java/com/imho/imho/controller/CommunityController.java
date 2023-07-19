package com.imho.imho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import com.imho.imho.entity.CommunityPost;
import com.imho.imho.service.CommunityService;

@SpringBootApplication
public class CommunityController {
  
  @Autowired
  private CommunityService communityService;
  
  @PostMapping()
  public void communityWrite(CommunityPost communityPost) { 
    communityService.write(communityPost);
  }
}
