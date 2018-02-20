package com.eun.s1;

import java.util.*;

public class StudentService {

	//학생추가 메서드
	//메서드명 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	
	public Student [] addStudent() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 인원수를 입력해주세요:");
		int count = sc.nextInt();
		Student [] students= new Student[count];
		
		for(int i=0; i<students.length; i++) {
			Student student =new Student();	
			System.out.println("학생 이름입력:");
			student.name=sc.next();
			System.out.println("학생 번호입력:");
			student.num=sc.nextInt();
			
			students[i]=student;
		}
		
		return students;
	}
	

}
