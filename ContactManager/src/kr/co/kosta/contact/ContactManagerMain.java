package kr.co.kosta.contact;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import kr.co.kosta.contact.model.Contact;

public class ContactManagerMain {
	
	//1. ����ڿ��� ȭ���� �����ش�. (View)
	/*
	 * ====================================
	 * 1. ����ó ���
	 * 2. ����ó ��ü����
	 * Q. ����
	 * ==================================== 
	 * ����>
	 * 
	 * 1. �����ϸ� -->
	 * 
	 * ������̸��� �̸���, ����, �ּҸ� ���� �Է��� �ּ���(�����ڴ� �����̽��Դϴ�.)
	 * 
	 */
	
	//�ܼ� (�͹̳�)�� ���� ������Է��� ���� �� �ִ� ��Ʈ�� ����
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	Contact contact = new Contact("YECHANDO", "yechando93@gmail.com", 24, "seoul");
	
	System.out.print("�Է��Ͻð� �������ּ���:")
	String typed - br.readLine();
	
	System.out.println(contact);
	//Contact contact = new Contact("kim,,,,)
	
	//System.out.println(contact);
}


  