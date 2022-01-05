package com.icia.member.DTO;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class MemberSaveDTO {
    @NotBlank(message = "이메일은 필수입니다.")
    private String m_email;
    @NotBlank
    @Length(min = 2, max = 8, message = "2~8자로 입력해주세요")
    private String m_pw;
    private String m_name;
}