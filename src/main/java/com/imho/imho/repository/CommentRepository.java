package com.imho.imho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.imho.imho.entity.CommunityComment;

@Repository
public interface CommentRepository extends JpaRepository<CommunityComment, Integer>{

}
