package com.imho.imho.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CommunityPost {

  /*
   * @Entity : 클래스 위에 선언하여 이클래스가 엔티티임을 알려준다. 이렇게 되면 JPA에서 정의된 필드들을 바탕으로 데이터베이스에 테이블을 만들어준다.
   * 
   * @data : lombok 각 필드값을 조회할 수있는 getter와 setter를 조회해 준다.
   * 
   * @id , @GeneratedValue : 해당 엔티티의 주요키가 될 값을 지정해 주는 것이 @Id 이며 @GeneratedValue이 pk이라 자동으로 1씩 증가하게 되는 어노테이션이다.
   */
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Integer postId;
  private String title;
  private String article;
  private String file;
  private String userId;
  private String datePublished;
  private Integer commentsEnabled;
  private Integer views;


}
