package com.icia.member.controller;

import com.icia.member.DTO.MemberDetailDTO;
import com.icia.member.DTO.MemberLoginDTO;
import com.icia.member.DTO.MemberSaveDTO;
import com.icia.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member/*")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService ms;

    @GetMapping("save")
    public String saveForm(Model model){
        model.addAttribute("member", new MemberSaveDTO());
        return "member/save";
    }
    @PostMapping("save")
    public String save(@Validated @ModelAttribute("member") MemberSaveDTO memberSaveDTO, BindingResult bindingResult){
        System.out.println("memberSaveDTO = " + memberSaveDTO);
        System.out.println("MemberController.save");

        if(bindingResult.hasErrors()){
            return "member/save";
        }

        ms.save(memberSaveDTO);
        return "redirect:/member/login";
    }
    @GetMapping("login")
    public String loginForm(Model model){
        model.addAttribute("member2", new MemberLoginDTO());
        return "member/login";
    }
    @PostMapping("login")
    public String login(@Validated @ModelAttribute("member2") MemberLoginDTO memberLoginDTO, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "member/login";
        }
        return "redirect:/member/findAll";
    }

    // 상세조회
    // /member/2, /member/15 => /member/{memberId}
    @GetMapping("{memberId}")
    public String findById(@PathVariable("memberId") Long memberId, Model model){
        System.out.println("memberId = " + memberId);
        MemberDetailDTO member = ms.findById(memberId);
        model.addAttribute("member", member);
        return "member/detail";
    }

}



















