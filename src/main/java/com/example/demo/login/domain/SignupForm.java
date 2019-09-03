package com.example.demo.login.domain;



import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm{
	@NotBlank
	@Email
	//index.htmlのnameを定義
	private String userId;//ユーザーID
	@NotBlank
	@Length(min=4, max=100)
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	private String password;//パスワード
	@NotBlank
	private String userName;//ユーザー名
	@NotNull
	//@DateTimeFormat 画面から送られてくる文字列を日付型に変更する
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;//誕生日
	@NotNull
	@Min(20)
	@Max(100)
	private int age;//年齢
	@AssertFalse
	private boolean marriage;//結婚ステータス
}
