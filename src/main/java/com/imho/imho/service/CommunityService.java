package com.imho.imho.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imho.imho.entity.CommunityComment;
import com.imho.imho.entity.CommunityPost;
import com.imho.imho.entity.CommunityUser;
import com.imho.imho.repository.CommentRepository;
import com.imho.imho.repository.PostsRepository;
import com.imho.imho.repository.UserRepository;

@Service
public class CommunityService {

  @Autowired private PostsRepository postsRepository;
  @Autowired private UserRepository userRepository;
  @Autowired private CommentRepository commentRepository;

  public void postWrite(CommunityPost communityPost) {
    postsRepository.save(communityPost);
  }
  public List<CommunityPost> getWrite() {
//    postsRepository.findAll();re
    return postsRepository.findAll();
  }
  public void userMember(CommunityUser communityUser) {
    userRepository.save(communityUser);
  }
  public void commentWrite(CommunityComment communityComment) {
    commentRepository.save(communityComment);
  }


}
