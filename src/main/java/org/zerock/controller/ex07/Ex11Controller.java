package org.zerock.controller.ex07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("ex11")
@Controller
public class Ex11Controller {

	// @RequestMapping(value ="login", method = RequestMethod.GET)
	@RequestMapping(value = "login", method = RequestMethod.GET)
	@GetMapping
	public void loginFrom() {

		System.out.println("로그인 화면으로 포워드");
	}

	// @RequestMapping(value ="login", method = RequestMethod.POST)
	@RequestMapping(path = "login", method = RequestMethod.POST)
	public String loginProcess(String id, String password, RedirectAttributes rttr) {
		System.out.println("로그인처리");
		boolean ok = false;
		if (id != null && id.equals(password)) {
			ok = true;
		}
		if (ok) {
			rttr.addFlashAttribute("messege", "로그인 성공");

			return "redirect:/ex11/main";
		} else {

			rttr.addFlashAttribute("messege", "아이디나 페스워드 불일치");
			return "redirect:/ex11/login";
		}
	}

	@GetMapping("main")
	public void main() {

	}

	@RequestMapping("sub1")
	public String method1(RedirectAttributes rttr) {
		rttr.addFlashAttribute("address", "seoul");

		return "redirect:/ex11/sub2";
	}

	@RequestMapping("sub2")
	public void method2(@ModelAttribute("address") String address) {
		System.out.println(address);

	}
}