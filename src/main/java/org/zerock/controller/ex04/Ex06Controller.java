package org.zerock.controller.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("ex06")
public class Ex06Controller {
	
	@RequestMapping("sub01")
	public String method01() {
		
		// prefix:/WEB-INF/views/
		// suffix:.jsp
		
		// full view name : /WEB-INF/views/myview01.jsp
		return "myview01";
		
	}
	@RequestMapping("sub02")
	public String method02() {
		
		
		return "myview02";
	}
	
	
	
}
