package org.zerock.controller.ex09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;
import org.zerock.domain.ex01.PageInfoDto;
import org.zerock.service.ex01.Ex04Service;
import org.zerock.service.ex03.Ex05Service;

@Controller
@RequestMapping("ex14")
public class Ex14Controller {

	@Autowired
	private Ex04Service service;

	@RequestMapping("sub01")
	public void method01(int id, Model model) {
		//1. request parameter 가공/처리

		//2. bussiness logic 처리
		String name = service.getNameById(id);

		//3. model addattribute
		model.addAttribute("name", name);
		//4. forward/redirect
	}

	//ex14/sub02?id=3;
	//view에서 퍼스트 네임이 출력 되도록 해봐라
	//controller 메소드 추가
	//mapper에도 메소드 추가
	//jsp 작성

	@Autowired
	private Ex05Service service1;
	// 같은이름안됨.

	@RequestMapping("sub02")
	public void method02(int id, Model model) {
		String firstName = service1.getEmployeeFirstNameById(id);

		//3. model addattribute
		model.addAttribute("employeename", firstName);
	}

	//ex14/sub03?id=3
	@RequestMapping("sub03")
	public void method03(int id, Model model) {
		CustomerDto dto = service.getCustomerInfoById(id);

		model.addAttribute("customer", dto);

	}
	//ex14/sub04?id=3;
	//view에서 퍼스트 네임과 라스트 네임이 출력 되도록 해봐라
	//controller 메소드 추가
	//mapper에도 메소드 추가
	//jsp 작성
	//EmployeeDto 작성

	@RequestMapping("sub04")
	public void method04(int id, Model model) {
		EmployeeDto dto = service.getEmployInfoById(id);
		model.addAttribute("employee", dto);

	}

	@GetMapping("sub05")
	public void method05() {

	}

	@PostMapping("sub05")
	public String method06(CustomerDto customer, RedirectAttributes rttr) {
		//1. request parameter 가공/처리
		System.out.println(customer);
		//2. bussiness logic 처리
		boolean ok = service.addCustomer(customer);
		if (ok) {
			rttr.addFlashAttribute("messege", "등록완료");

		} else {
			rttr.addFlashAttribute("messege", "등록실패");

		}
		return "redirect:/ex14/sub05";
		//3. model addattribute
	}
	@GetMapping("sub06")
	public void employeeInputForm() {
		
	}
	@PostMapping("sub06")
	public String method08(EmployeeDto employee, RedirectAttributes rttr) {
		boolean ok = service.addEmployee(employee);
		
		if (ok) {
			rttr.addFlashAttribute("messege", "등록완료");

		} else {
			rttr.addFlashAttribute("messege", "등록실패");

		}
		return "redirect:/ex14/sub06";
	}
	@GetMapping("sub07")
	public void method07(Model model) {
		List<EmployeeDto> list = service.listEmployee();
		
		model.addAttribute("employees", list);
	}
	@GetMapping("sub08")
	public void CustomerInputForm(Model model) {
		List<CustomerDto> list = service.listCustomers();
		
		model.addAttribute("customers", list);
	}
	@GetMapping("sub09")
	public String method09(@RequestParam(name = "page", defaultValue = "1")int page, Model model) {
		int rowPerPage = 5;
		
	
		
		List<CustomerDto> list = service.listCustomersPage(page,rowPerPage);
		int totalRecords = service.countCustomers();
		
		int end = (totalRecords - 1)/rowPerPage;
		
		
		
		PageInfoDto pageInfo = new PageInfoDto();
		pageInfo.setCurrent(page);
		pageInfo.setEnd(end);
		
		model.addAttribute("customers", list);
		model.addAttribute("pageInfo",pageInfo);
		return"/ex14/sub09";
	}
	
}
