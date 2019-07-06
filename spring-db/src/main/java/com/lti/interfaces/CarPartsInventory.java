package com.lti.interfaces;

import java.util.List;

import com.lti.component.CarPart;

public interface CarPartsInventory {
	
	public void addNewPart (CarPart carPart);
	
	public List<CarPart> getAvailableParts();
}
