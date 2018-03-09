package bhdleon.dashboard.servicesImpl;

import bhdleon.dashboard.models.Executive;
import bhdleon.dashboard.services.ExecutiveService;

public class ExecutiveServiceImpl implements ExecutiveService {

	@Override
	public Executive get(String id) {
		Executive executive = new Executive("Elio", "Tavarez");

		return executive;
	}
	
	public Executive add(Executive executive) {
		return executive;
	}

}
