package com.jbk.GetMapping.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.GetMapping.Service.Service;
import com.jbk.GetMapping.entity.Team;

@RestController
@RequestMapping("/api")
public class controller {
 
	@Autowired
	Service service;
	
	
	@PostMapping("/add")
	public String add(Team t) {
		
	String msg=	service.add(t);
	if(Objects.isNull(msg)) {
		msg="not addes data";
	}
	
	return msg;
	}

}
