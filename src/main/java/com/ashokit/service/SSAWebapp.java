package com.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class SSAWebapp {

	public String FetchStateName(String ssn) {

		String statename = null;

		if (ssn.startsWith("4")) {
			statename = "NewJersey";
		} else if (ssn.startsWith("5")) {
			statename = "Newyork";
		} else if (ssn.startsWith("6")) {
			statename = "Texas";
		} else if (ssn.startsWith("7")) {
			statename = "Kentucky";
		} else {
			statename = "Invalid SSN";
		}
		return statename;
	}
}
