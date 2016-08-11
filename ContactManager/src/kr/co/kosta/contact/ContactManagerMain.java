package kr.co.kosta.contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import kr.co.kosta.contact.model.Contact;

public class ContactManagerMain {
	
	//1. 사용자에게 화면을 보여준다. (View)
	/*
	 * ====================================
	 * 1. 연락처 등록
	 * 2. 연락처 전체보기
	 * Q. 종료
	 * ==================================== 
	 * 선택>
	 * 
	 * 1. 선택하면 -->
	 * 
	 * 사용자이름과 이메일, 나이, 주소를 각각 입력해 주세요(구분자는 스페이스입니다.)
	 * 
	 */
	
	//콘솔 (터미널)을 통행 사용자입력을 받을 수 있는 스트림 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	Contact contact = new Contact("YECHANDO", "yechando93@gmail.com", 24, "seoul");
	
	System.out.print("입력하시고 엔터쳐주세요:")
	String typed - br.readLine();
	
	System.out.println(contact);
	//Contact contact = new Contact("kim,,,,)
	
	//System.out.println(contact);
}


  