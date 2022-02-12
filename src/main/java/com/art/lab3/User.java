package com.art.lab3;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class User implements SelfCheckCapable {
	
	private String device;
	private String account;
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "User";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.15);
	}

}
