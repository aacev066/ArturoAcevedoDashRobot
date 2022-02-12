package com.art.lab3;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class VehicleComputer implements SelfCheckCapable {
	
	private float memory;
	private float processingPower;
	private boolean connection;
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "VehicleComputer";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	

}
