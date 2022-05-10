package org.zerock.controller.ex05;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex09")
public class Ex09Controller {
	@RequestMapping("sub01")
	public void method01(String name, Model model) {

		// 1.request 파라미터 수집/가공
		// 3.model에 attrbute 추가
		System.out.println(name);
		// 4. view forward : ex09/sub01.jsp

		model.addAttribute("name", name);
	}

	@RequestMapping("sub02")
	public String method02(@ModelAttribute("name") String name) {
		
	System.out.println(name);
	return "ex09/sub01";
	}

	@RequestMapping("sub03")
	public void method03(@ModelAttribute("address") String address,
							@ModelAttribute("email") String email) {
		//모델어트리뷰트는 서브스트링에서 뽑아서 가져오는건가
	
	
	}	
	@RequestMapping("sub04")
	public void method04(@ModelAttribute("customer") Customer customer) {
	
	
	}
	
	@RequestMapping("sub05")
	public String method05(@ModelAttribute Customer customer) {
		return "ex09/sub04";
	
	}
	
	@RequestMapping("sub06")
	public String method06(Customer customer) {
		return "ex09/sub04";
		
		// sub 04,05,06 다 같은 값  모델어트리뷰트는 생략 엄청가느으으으으응응
		// string 쓴거는 뷰이름을을 직접 결정
		// void는 경로가 view이름을  결정
	}
	
	
	@RequestMapping("sub07")
	public void method07(Employee employee) {
		
		
		
	}
	
	/*public String method07(HttpServletRequest request) {
		String name = request.getParameter("name");
		String salaryStr =  request.getParameter("salary");
		String email = request.getParameter("email");
		
		Employee emp = new Employee();
		
		
		
		
	}*/
	
	
	
}
