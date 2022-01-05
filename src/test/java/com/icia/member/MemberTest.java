package com.icia.member;

import com.icia.member.DTO.MemberSaveDTO;
import com.icia.member.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberTest {
    /*
        MemberServiceLmpl.save() 메서드가 잘 동작하는지를 테스트

        회원가입 테스트
        save.html 에서 회원정보 입력 후 가입클릭
        DB 확인
     */
    @Autowired
    private MemberService ms;

    @Test
    @DisplayName("회원가입 테스트")
    public void memberSaveTest(){
        MemberSaveDTO memberSaveDTO = new MemberSaveDTO(); // new MemberSaveDTO() 쓰고 알트 엔터치면 자동완성
        memberSaveDTO.setM_email("테스트 회원 이메일1");
        memberSaveDTO.setM_pw("테스트 비번1");
        memberSaveDTO.setM_name("테스트 회원 이름1");

        ms.save(memberSaveDTO);

    }
}
