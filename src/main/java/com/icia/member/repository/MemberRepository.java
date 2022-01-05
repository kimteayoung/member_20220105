package com.icia.member.repository;

import com.icia.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<해당 Entity클래스 이름, PK타입>
// JpaRepository 상속받아 쓸 때는 @Repository 안씀.
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
