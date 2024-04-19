package com.jbk.GetMapping.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.jbk.GetMapping.Dao.Dao;
import com.jbk.GetMapping.entity.Team;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao dao;
	
	public String add(Team t) {
		
	String msg=	dao.add(t);
	if(Objects.isNull(msg)) {
		msg="not addes data";
	}
	
	return msg;
	}

}
