package com.eun.s1;

import java.util.*;

public class StudentService {

	Scanner sc = new Scanner(System.in);

	//학생추가 메서드
	//메서드명 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력

	public Student [] addStudent() {

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


	//메서드명은 addPoint
	//내용 : 각학생의 점수 입력
	public void addPoint(Student [] students) {
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].name+"국어 점수 입력: ");
			students[i].kor=sc.nextInt();
			System.out.println(students[i].name+"영어 점수 입력: ");
			students[i].eng=sc.nextInt();
			System.out.println(students[i].name+"수학 점수 입력: ");
			students[i].math=sc.nextInt();
			
			students[i].total =students[i].kor+students[i].eng+students[i].math;
			students[i].avg=students[i].total/3;
			
		}
	
	}

}
