package com.kosmo.k11security;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	/*
	 시큐리티 1단계 기본페이지 사용
	 */
	@RequestMapping("/security1-1/index.do")
	public String security1_1() {
		
		return "09Security/Step1/index";
	}
	
	@RequestMapping("/security1-2/access.do")
	public String security1_2() {
		
		return "09Security/Step1/access";
	}
	
	/*
	 시큐리티 2단계 로그인 화면 커스텀
	 */
	
	@RequestMapping("/security2/index.do")
	public String securityIndex2(Principal principal, Authentication authentication, Model model) {
		/*
		 1. Controller 에서 시큐리티를 통해 로그인한 사용자 정보 가져오기
		 	:@Controller 로 선언된 클래스에서는 메소드 인자로 
		 	Principal 객체를 통해 사용자 아이디를 얻어올 수 있다 
		 */
		//1-1. principal 객체를 통한 사용자 아이디 반환
		String user_id = principal.getName();
		System.out.println("user_id = " + user_id);
		
		//1-2. Authentication 객체를 통한 아이디 반환
		UserDetails userDetails = 
				(UserDetails)authentication.getPrincipal();
		String detail_id = userDetails.getUsername();
		System.out.println("detail_id : "+detail_id);
		
		/* SecurityContextHolder
		 2. 일반적인 클래스에서 사용자 정보 얻어오기
		 (컨트롤러 어노테이션이 붙지않은 일반적인 클래스)
		 :스프링 컨테이너의 전역변수로 선언된 SecurityContextHolder 객체를 이용해서 사용자의 아이디를 얻어온다. 
		 */ 
		Object object = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails sch = (UserDetails)object;
		String sch_id = sch.getUsername();
		System.out.println("sch_id : "+ sch_id);
		
		
		model.addAttribute("user_id",user_id);
		return "09Security/Step2/index";
	}
	
	@RequestMapping("/security2/login.do")
	public String securityIndex2Login(Principal principal,Model model) {
		
		String user_id = "";
		//예외처리가 돼있는 이유는 로그인이 되었을수도 있고 안되어있을수도 있기떄문에 !!
		try {
			user_id = principal.getName();
			System.out.println("user_id : "+user_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("user_id",user_id);
		
		return "09Security/Step2/login";
	}
	
	@RequestMapping("/security2/accessDenied.do")
	public String securityIndex2AccessDenied() {
		
		return "09Security/Step2/accessDenied";
	}
	
	@RequestMapping("/security2/admin/main.do")
	public String securityIndex2AdminMain() {
		
		return "09Security/Step2/adminMain";
	}
	
	//사용시 주의사항
	@RequestMapping("/security3/form.do")
	public String formPage() {
		
		return "09Security/Warning/postForm";
	}

}
