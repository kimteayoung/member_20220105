package com.icia.member.service;

import com.icia.member.DTO.MemberDetailDTO;
import com.icia.member.DTO.MemberLoginDTO;
import com.icia.member.DTO.MemberSaveDTO;

import java.util.List;

public interface MemberService {
    Long save(MemberSaveDTO memberSaveDTO);

    MemberDetailDTO findById(Long memberId);

    boolean login(MemberLoginDTO memberLoginDTO);

    List<MemberDetailDTO> findAll();
}
