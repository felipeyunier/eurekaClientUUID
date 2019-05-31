package com.euraka.uuid.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.euraka.uuid.configuration.LoadConfiguration;
import com.euraka.uuid.configuration.WebServerFacotryCustomizerConfiguration;

@RestController
public class UuidController {

	@Autowired
	private LoadConfiguration loadConfiguration;
	
	@Autowired
	private WebServerFacotryCustomizerConfiguration webServerFacotryCustomizerConfiguration;
	
	@GetMapping(value="/getUuid")
	public String getUuid() {
		return this.loadConfiguration.getMensaje() +
				webServerFacotryCustomizerConfiguration.getPort()
				+" -----> "+ UUID.randomUUID().toString();
	}
}
