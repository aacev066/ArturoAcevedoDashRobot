package com.art.lab3;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class IdentityProvider implements SelfCheckCapable {
	
	private String name;
	private int validationMethod;
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "IdentityProvider";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}

}
