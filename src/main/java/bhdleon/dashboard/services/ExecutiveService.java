package bhdleon.dashboard.services;

import bhdleon.dashboard.models.Executive;

public interface ExecutiveService {
	Executive get(String id);
	Executive add(Executive executive);
}
