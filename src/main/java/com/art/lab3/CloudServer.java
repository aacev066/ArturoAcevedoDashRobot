package com.art.lab3;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class CloudServer implements SelfCheckCapable {
	private float memory;
	private int vehicleCount;
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "CloudServer";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
