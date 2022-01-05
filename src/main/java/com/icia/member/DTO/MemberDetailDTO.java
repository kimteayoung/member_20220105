package com.icia.member.DTO;

import com.icia.member.entity.MemberEntity;
import lombok.Data;

@Data
public class MemberDetailDTO {
    private Long m_id;
    private String m_email;
    private String m_pw;
    private String m_name;

    public static MemberDetailDTO toMemberDetailDTO(MemberEntity member){
        MemberDetailDTO memberDetailDTO = new MemberDetailDTO();
        memberDetailDTO.setM_id(member.getId());
        memberDetailDTO.setM_email(member.getM_email());
        memberDetailDTO.setM_pw(member.getM_pw());
        memberDetailDTO.setM_name(member.getM_name());
        return memberDetailDTO;
    }
}
