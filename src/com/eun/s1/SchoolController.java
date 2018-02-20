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
		System.out.println("숫자를 입력해주세요:");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("학생등록");
			break;
		case 2:
			System.out.println("성적입력");
			break;
		case 3:
			System.out.println("성적조회");
			break;
		case 4:
			System.out.println("전체조회");
			break;
		case 5:
			System.out.println("프로그램종료");
			break;
		default:
			System.out.println("잘못된 번호를 입력하였습니다.");
		}
	}

}
