package com.capgemini.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {

	@RequestMapping("/")
	public String user() {
		return "jenkins user";
	}
}
