package org.zerock.controller.ex01;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex01Controller {
  // 콘퍼넌트 붙히면 스프링 빈이됨
  // 콘트롤러 안에 콘퍼넌트 있다.
  // 
	@RequestMapping("/ex01/sub01")
	public void method01(){
		System.out.println("메소드 일한다.");
	}
	@RequestMapping("/ex01/sub02")
	public void method02() {
		System.out.println("메소드 2 일한다.");
	}
	
}
