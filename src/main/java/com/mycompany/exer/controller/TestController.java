package com.mycompany.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("/record")
public class TestController {

	@RequestMapping (value = "/")
	public String home() {
		return "hello";
	}
	@RequestMapping (value = "/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping (value = "/kbo")
	public String kbo(Model model) {
		// 모델 객체에 싣어 보낸다(request.setAttribute 같은 개념)
		String rank1 = "LG";
		String rank2 = "한화";
		model.addAttribute("rank1", rank1);
		model.addAttribute("rank2", rank2);
		return "record/kbo"; // 뷰
	}
	@RequestMapping (value = "/mlb")
	public ModelAndView mlb() {
		// 모델 객체에 싣어 보내기
		String rank3 = "LA";
		String rank4 = "SF";
		ModelAndView mv = new ModelAndView();
		mv.addObject("rank3", rank3); // 모델 객체에 데이터 전달하기
		mv.addObject("rank4", rank4);
		mv.setViewName("record/mlb"); // 뷰 이름 설정
		return mv;
	}
}
