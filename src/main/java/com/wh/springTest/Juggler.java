package com.wh.springTest;

public class Juggler implements Performer {
    private int beanBags=3;
    public Juggler() {
		// TODO Auto-generated constructor stub
	}
    public Juggler(int beanBags) {
		// TODO Auto-generated constructor stub
    	this.beanBags=beanBags;
	}
	public void performer() {
		// TODO Auto-generated method stub
		System.out.println("Juggler:"+beanBags);
		
	}

}
