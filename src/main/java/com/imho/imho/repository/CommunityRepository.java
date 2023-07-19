package com.imho.imho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.imho.imho.entity.CommunityPost;

@Repository
public interface CommunityRepository extends JpaRepository<CommunityPost,Integer>{ 

  /*
   * JpaRepository를 상속받도록 함으로써 기본적인 동작이 모두 가능해진다! JpaRepository는 어떤 엔티티를 메서드의 대상으로 할지를 다음 키워드로 지정한다.
   * JpaRepository<대상으로 지정할 엔티티, 해당 엔티티의 PK의 타입>.
   */
}
