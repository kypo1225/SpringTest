package com.example.demo.login.domain;



import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.login.domain.model.ValidGroup1;
import com.example.demo.login.domain.model.ValidGroup2;
import com.example.demo.login.domain.model.ValidGroup3;

import lombok.Data;

@Data
public class SignupForm{
	//GroupOrderの追加
	@NotBlank(groups = ValidGroup1.class)
	@Email(groups = ValidGroup2.class)
	//index.htmlのnameを定義
	private String userId;//ユーザーID
	@NotBlank(groups = ValidGroup1.class)
	@Length(min=4, max=100, groups = ValidGroup2.class)
	@Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidGroup3.class)
	private String password;//パスワード
	@NotBlank(groups = ValidGroup1.class)
	private String userName;//ユーザー名
	@NotNull(groups = ValidGroup1.class)
	//@DateTimeFormat 画面から送られてくる文字列を日付型に変更する
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date birthday;//誕生日
	@NotNull
	@Min(value = 20, groups = ValidGroup2.class)
	@Max(value = 100, groups = ValidGroup2.class)
	private int age;//年齢
	@AssertFalse(groups = ValidGroup2.class)
	private boolean marriage;//結婚ステータス
}
