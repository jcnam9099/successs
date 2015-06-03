package com.company.success;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		Result a = new Result();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		// model 에 serverTime 이라는 이름으로 formattedDate 값을 넣고있음
		model.addAttribute("serverTime", formattedDate );
		int add = a.add(3, 8);
		int sub = a.sub(11, 9);
		int mul = a.mul(87,20);
		int div = a.div(44, 20);
		// model 에 result 라는 이름으로 지난번에 만든 사칙연산의 결과를 넣는다.
		model.addAttribute("add", add);
		model.addAttribute("sub", sub);
		model.addAttribute("mul", mul);
		model.addAttribute("div", div);
	    // 결과는 4 개이므로 result1, result2, result3, result4 이렇게 4 개가 필요함.
		// home.jsp 에 각4개를 뿌려준다.

		return "home";
	}
	
public class Result{
	public int add(int a, int b){
		result a+b;
	}
	int sub(int a, int b){
		result a-b;
	}
	int mul(int a, int b){
		result a*b;
	}
	int div(int a, int b){
		result a/b;
	}
}
	
}
