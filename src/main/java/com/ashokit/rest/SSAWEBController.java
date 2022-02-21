package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.service.SSAWebapp;

@RestController
public class SSAWEBController {

	@Autowired
	private SSAWebapp ssa;

	@GetMapping("/state/{ssn}")
	public ResponseEntity<String> FetchStateName(@PathVariable String ssn) {
		String stateName = ssa.FetchStateName(ssn);
		return new ResponseEntity<>(stateName, HttpStatus.OK);
	}

}