package com.imho.imho.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.imho.imho.entity.CommunityComment;
import com.imho.imho.entity.CommunityPost;
import com.imho.imho.entity.CommunityUser;
import com.imho.imho.service.CommunityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/imho")
public class CommunityController {

  @Autowired
  private CommunityService communityService;

  // 게시물 등록
  @PostMapping("/posts")
  public void postWrite(@RequestBody CommunityPost communityPost) {
    communityService.postWrite(communityPost);
  }

  // 게시글 테이블 조회
  @GetMapping("/postget")
  public List<CommunityPost> getWrite() {
    return communityService.getWrite();
  }

  // 댓글 테이블 조회
  @GetMapping("/commentget")
  public List<CommunityComment> getComment() {
    return communityService.getComment();
  }
  // 회원가입
  @PostMapping("/memberJoin")
  public void userMember(@RequestBody CommunityUser communityUser) {
    communityService.userMember(communityUser);
  }

  // 댓글작성
  @PostMapping("/comment")
  public void commentWrite(@RequestBody CommunityComment communityComment) {
    communityService.commentWrite(communityComment);
  }

  // 로그인
  @PostMapping("/login")
  public boolean commentLogin(@RequestBody CommunityUser communityUser) {
    return communityService.commentLogin(communityUser);
  }
}
