package com.imho.imho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imho.imho.entity.CommunityPost;
import com.imho.imho.repository.CommunityRepository;

@Service
public class CommunityService {
  
  @Autowired
  private CommunityRepository communityRepository;
  
  public void write(CommunityPost communityPost) {
    communityRepository.save(communityPost);
    
  }
}
