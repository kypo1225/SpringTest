package com.example.demo.login.domain.model;
import javax.validation.GroupSequence;

//バリテーションのグループ作成（バリテーションの順番を決める為。つまりユーザーIDからエラーを出すように処理）
//Controllerクラスと、Formクラスの編集も必要
@GroupSequence({ValidGroup1.class,ValidGroup2.class,ValidGroup3.class})
public interface GroupOrder {

}
