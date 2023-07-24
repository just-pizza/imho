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
@Table(name = "community_user")
public class CommunityUser {

  /*
   * @Entity : 클래스 위에 선언하여 이클래스가 엔티티임을 알려준다. 이렇게 되면 JPA에서 정의된 필드들을 바탕으로 데이터베이스에 테이블을 만들어준다.
   * @Dynamic : insert 되기 전에 엔티티에 설정된 컬럼 정보 중 null이 아닌 컬럼만을 이용하여 동적 insert 쿼리를 생성합니다.
   * @data : lombok 각 필드값을 조회할 수있는 getter와 setter를 조회해 준다.
   * @Column 어노테이션을 사용하여 해당 필드를 원하는 컬럼과 매핑할 수 있습니다. 이를 통해 객체와 데이터베이스 간의 필드 이름 차이를 해결할 수 있습니다.
   * @id , @GeneratedValue : 해당 엔티티의 주요키가 될 값을 지정해 주는 것이 @Id 이며 @GeneratedValue이 pk이라 자동으로 1씩 증가하게 되는 어노테이션이다.
   */
  @Id
  @Column(name="user_id")
  private String userId;

  private String name;
  private String email;
  boolean login;

}
