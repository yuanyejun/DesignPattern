package cn.designpattern.uml.aggregation;

public class Computer {

	private Mouse mouse; //???????computer????
	private Moniter moniter;//??????????Computer????
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
