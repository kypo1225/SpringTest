package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.login.domain.SignupForm;
import com.example.demo.login.domain.model.GroupOrder;

@Controller //(これらのアノテーションがついてるものをBeanといい、DIコンテナ上で管理するクラスをBeanという)
public class SignupController {
	private Map<String, String> radioMarriage;
	private Map<String, String>initRadioMarriage(){
		//ラジオボタンの初期化
		Map<String, String> radio = new LinkedHashMap<>();
		//既婚、未婚をMapに格納
		radio.put("既婚", "true");
		radio.put("未婚", "false");
		return radio;
		
	}
	
	@RequestMapping(value = "/signup")
	public String getSignUp(@ModelAttribute SignupForm form, Model model) {
		//ラジオボタンの初期化のメソッドを呼ぶ
		radioMarriage = initRadioMarriage();
		//ラジオボタン用のMapをmodelに登録
		model.addAttribute("radioMarriage", radioMarriage);
		
		return "login/signup";
	}
	
	@PostMapping("/signup")
	//フォームクラスをmodelに登録
	//@Validatedでバリテーション実施。BindingResultクラスに入っている
	//GroupOrderからバリテーションのグループを保持
	public String postSignUp(@ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult, Model model) {
		//データバインドの失敗の場合、登録画面に戻る
		if(bindingResult.hasErrors()) {
			//Getリクエストメソッドを呼び出す。
			return getSignUp(form, model);
		}
		System.out.println(form);
		
		return "redirect:/login";
	}

}
