package kr.co.ch03;

import org.springframework.stereotype.Component;

@Component
public class AOPService {

	public void insert() {
		System.out.println("글작성");
	}
	public void select() {
		System.out.println("글보기");
	}
	public void update() {
		System.out.println("글수정");
	}
	public void delete() {
		System.out.println("글삭제");
	}
	
}
