package com.icia.member.entity;

import com.icia.member.DTO.MemberSaveDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "member_table")
public class MemberEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "member_id") // 별도 컬럼이름 지정할 때
    private Long id;

    // m_email: 크기50, unique
    @Column(length = 50, unique = true)
    private String m_email;

    // m_pw: 크기20
    @Column(length = 20)
    private String m_pw;

    // Column 생략하면 default 크기 255로 지정됨
    private String m_name;

    /*
        DTO클래스 객체를 전달받아 Entity 클래스 필드값으로 세팅하고
        Entity 객체를 리턴하는 메서드 선언

        static 메서드 (정적메서드)
     */
    public static MemberEntity saveMember(MemberSaveDTO memberSaveDTO){
        MemberEntity memberEntity = new MemberEntity(); // new MemberSaveDTO() 쓰고 알트 엔터치면 자동완성
        memberEntity.setM_email(memberSaveDTO.getM_email());
        memberEntity.setM_pw(memberSaveDTO.getM_pw());
        memberEntity.setM_name(memberSaveDTO.getM_name());
        return memberEntity;
    }
}









