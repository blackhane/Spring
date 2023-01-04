package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ltv")
public class LgTV implements TV {

	@Autowired
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV powerOff");
	}

	@Override
	public void chUp() {
		System.out.println("LgTV chUp");
	}

	@Override
	public void chDown() {
		System.out.println("LgTV chDown");
	}

	@Override
	public void soundUp() {
		speaker.soundUp();
	}

	@Override
	public void soundDown() {
		speaker.soundDown();
	}

}
