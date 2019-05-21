package com.euraka.uuid.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UuidController {

	@GetMapping(value="/getUuid")
	public String getUuid() {
		return UUID.randomUUID().toString();
	}
}
