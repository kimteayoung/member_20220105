package com.icia.member.repository;

import com.icia.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository< 해당 Entity 클래스이름, pk 타입>
// JpaRepository 상속받아 쓸 때는 @Repository 안씀.
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일을 조건으로 회원조희 (select * from member_table where member_email=?)
    /*
        메서드 리턴타입: MemberEntity
        메서드이름: findByMemberEmail
        메서드 매개변수: String memberEemail( DB쪽으로 이메일을 넘겨 주면 된다
     */
    MemberEntity findByMemberEmail(String memberEmail);
}
