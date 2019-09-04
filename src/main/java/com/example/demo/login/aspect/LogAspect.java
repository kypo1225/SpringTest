/*
 * package com.example.demo.login.aspect;
 * 
 * import org.aspectj.lang.JoinPoint; import org.aspectj.lang.annotation.After;
 * import org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before; import
 * org.springframework.stereotype.Component;
 * 
 * //AOP実装（ログ出力）@ComponentでDIコンテナにBean定義
 * 
 * @Aspect
 * 
 * @Component public class LogAspect{ //AOPの実装
 * execution(<戻り値><パッケージ名>.<クラス名>.<メソッド名>(<引数>)”
 * 
 * @Before(
 * "execution(*com.example.demo.login.controller.LoginController.getLogin(..))")
 * public void startLog(JoinPoint jp){
 * System.out.println("メソッド開始："+jp.getSignature());} //AOPの実装
 * 
 * @After(
 * "execution(*com.example.demo.login.controller.LoginController.getLogin(..))")
 * public void endLog(JoinPoint jp){
 * System.out.println("メソッド終了："+jp.getSignature());} }
 */
