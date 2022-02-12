package com.art.lab3;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class DeviceManager implements SelfCheckCapable {
	
	private String account;
	
	public DeviceManager() {
		
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "DeviceManager";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.15);
	}

}
