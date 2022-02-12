package com.art.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

public class SmartVehicle implements GenericComponent{
	
	private String model;
	private CloudServer myCloudServer;
	private DeviceManager myDeviceManager;
	private IdentityProvider myIdentityProvider;
	private User myUser;
	private VehicleComputer myVehicleComputer;
	
	// Declaration of constructors
	
	public SmartVehicle() {
		
		myCloudServer = new CloudServer();
		myDeviceManager = new DeviceManager();
		myIdentityProvider = new IdentityProvider();
		myUser = new User();
		myVehicleComputer = new VehicleComputer();
		
		
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Smart Vehicle Gen 1";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myCloudServer, myDeviceManager, myIdentityProvider, myUser, myVehicleComputer); // add all your sub components
		return internalComponents;
	}

}
