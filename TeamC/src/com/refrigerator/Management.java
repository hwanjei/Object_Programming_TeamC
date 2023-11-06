package com.refrigerator;

import java.util.Scanner;
import mgr.Manager;

public class Management{
	Scanner scan = new Scanner(System.in);
	Manager<Refrigerator> rMgr = new Manager<>();
	
	public void run() {
		
	}
	
	public void Mainmenu() {
		Refrigerator rf = null;
		int ref,menu;
		System.out.println("= 냉장고 식료품 관리 프로그램 =");
		System.out.println("회원로그인(냉장고 일련번호 입력) : ");
		ref = scan.nextInt();
		rf = rMgr.find(ref+"");
		if(rf == null) {
			System.out.println("냉장고를 찾을 수 없습니다. 새로운 냉장고를 등록해주세요.");
			rf = new Refrigerator();
			rf.read(scan);
			rMgr.addItem(rf);
		}
		
		while(true) {
			System.out.println("로그인 일련번호 : "+rf.refcode);
			System.out.print("1. 식료품 관리 2. 레시피 관리 : ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: foodmenu(); break;
			case 2: recipemenu(); break;
			default : return;
			}
		}

	}
	public void foodmenu() {
		int menu;
		while(true) {
			System.out.print("1. 식료품 추가 2. 식료품 출력 3. 식료품 삭제"
					+ " 4. 식료품 검색 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
			case 2: //출력시 유통기한 확인해서 출력
			case 3:
			case 4:
			default :
			}
		}
	}
	
	public void recipemenu() {
		int menu;
		while(true) {
			System.out.print("1. 레시피 추가 2. 레시피 삭제 3. 레시피 검색 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
			case 2:
			case 3:
			default :
			}
		}
	}
	
	
	public static void main(String[] args) {
		Management refMgr = new Management();
		refMgr.run();
	}
}