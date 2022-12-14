package com.example.Login.controller;

import com.example.Login.dto.MemberDto;
import com.example.Login.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MemberController {
    private final MemberService memberService;

    //메인 페이지
    @GetMapping("/")
    public String index(){
        return "/index";
    }
    //회원가입 페이지
    @GetMapping("/user/signup")
    public String dispSignup(){
        return "/signup";
    }
    //회원가입 처리
    @GetMapping("/user/signup")
    public String execSignup(MemberDto memberDto){
        memberService.joinUser(memberDto);
        return "redirect:/user/login";
    }
    //로그인 페이지
    @GetMapping("/user/login")
    public String dispLogin(){
        return "/login";
    }
    //로그인 결과 페이지
    @GetMapping("/user/login/result")
    public String dispLoginResult(){
        return "/loginSuccess";
    }
    //로그아웃 결과 페이지
    @GetMapping("/user/logout/result")
    public String dispLogout(){
        return "/logout";
    }
    //접근 거부페이지
    @GetMapping("/user/denied")
    public String dispDenied(){
        return "/denied";
    }
    //내 정보 페이지
    @GetMapping("/user/info")
    public String dispMyInfo(){
        return "/myinfo";
    }
    //어드민 페이지
    @GetMapping("/admin")
    public String dispAdmin(){
        return "/admin";
    }
}
