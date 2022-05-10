package org.zerock.controller.ex05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.ex03.Customer;
import org.zerock.controller.ex03.Employee;

@Controller
@RequestMapping("ex08")
public class Ex08Controller {
	@RequestMapping("sub01")
	public String method01(HttpServletRequest req) {

		req.setAttribute("address", "new york");

		//	prefix :/WEB-INF/Views/
		//suffix:jsp
		// full view name : /WEB-INF/views/ex08/sub01.jsp
		return "/ex08/sub01";
	}

	@RequestMapping("sub02")
	public String method02(Model model) {

		model.addAttribute("address", "london");

		return "/ex08/sub01";
	}

	@RequestMapping("sub03")
	public String method03(Model model) {

		model.addAttribute("myName", "coinnest");
		model.addAttribute("myAge", "3month");

		return "/ex08/sub03";
	}

	@RequestMapping("sub04")
	public void method04(Model model) {
		model.addAttribute("food", new String[] { "apple", "milk", "coffee" });

	}

	@RequestMapping("sub05")
	public void method05(Model model) {

		List<String> list = new ArrayList<>();
		list.add("superman");
		list.add("peacemaker");
		list.add("death");
		model.addAttribute("heroList", list);

	}

	@RequestMapping("sub06")
	public void method06(Model model) {

		Map<String, String> map = new HashMap<>();
		map.put("name", "jin");
		map.put("song", "butter");
		map.put("future", "army");
		model.addAttribute("desc", map);

	}

	@RequestMapping("sub07")
	public void method07(Model model) {

		Customer cus = new Customer();
		cus.setAddress("seoul");
		cus.setAge(30);
		cus.setName("donald");
		
		model.addAttribute("customer",cus);
	}
	@RequestMapping("sub08")
	public void method08(Model model) {

		Employee emp = new Employee();
		emp.setEmail("emp@gmail.com");
		emp.setName("nada ");
		emp.setSalary(6000);
		
		model.addAttribute("employee",emp);
	}
	@RequestMapping("sub09")
	public String method09(Model model) {
		Employee emp = new Employee();
		emp.setEmail("korea12@daum.net");
		emp.setName("sunja");
		emp.setSalary(700000);
		
		model.addAttribute(emp); //어트리뷰트의 이름이 클래스 이름으로 결정 model.addAttribute("employee",emp);이거랑같음
		
		return "ex08/sub08";
		
	}
	@RequestMapping("sub10")
	public String method10(Model model) {
		Customer cus = new Customer();
		cus.setAddress("germany");
		cus.setAge(26);
		cus.setName("seyma");
		//model.addAttribute에서 꺼내서 쓰기
		//sub07.jsp에서 고객의 정보가 출력되도록코드를 완성
		model.addAttribute(cus);
		return "ex08/sub07";
	}
	@RequestMapping("sub11")
	public void method11(Model model) {
		List<String> l = new ArrayList<>();
		l.add("wanda");
		l.add("doctor");
		l.add("wong");
		model.addAttribute("list",l);
	
	}
	
	@RequestMapping("sub12")
	public void mechod12() {
		//1. request 파라미터 수집/가공
		//2. bussiness 로직처리
		//3. add attribute
		//4.forward/redirect
		
		
	}
	
}