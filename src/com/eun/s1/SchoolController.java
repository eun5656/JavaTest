package com.eun.s1;

import java.util.*;

public class SchoolController {

	//메서드명은 start
	//리턴은 x
	//내용은
	//1. 학생     등록
	//2. 성적     입력
	//3. 성적     조회
	//4. 전체     조회
	//5. 프로그램종료

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		Student [] students = null;
		StudentView view = new StudentView();
		boolean check = true;

		while(check) {

			System.out.println("1. 학생 등록");
			System.out.println("2. 성적 입력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 전체 조회");
			System.out.println("5. 프로그램종료");

			System.out.println("숫자를 입력해주세요:");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("학생등록");
				students = service.addStudent();
				break;
			case 2:
				System.out.println("성적입력");
				service.addPoint(students);
				break;
			case 3:
				System.out.println("성적조회");
				break;
			case 4:
				System.out.println("전체조회");
				view.view(students);
				break;
			default:
				System.out.println("finish");
				check=!check;
			}
		}
	}

}
