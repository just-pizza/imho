package com.imho.imho.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@DynamicInsert
@DynamicUpdate
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "community_post")
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
  @Column(name="post_id")
  private Integer postId;

  private String title;
  private String article;
  private String file;

  @Column(name="user_id")
  private String userId;

  @Column(name="date_published")
  private String datePublished;

  @Column(name="comments_enabled")
  private Integer commentsEnabled;
  private Integer views;


}
