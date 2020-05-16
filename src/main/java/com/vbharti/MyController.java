package com.vbharti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vbharti.model.RegisterModel;
import com.vbharti.model.dao.RegisterDao;

@Controller

public class MyController {

	@Autowired
	RegisterDao rd;

	@RequestMapping("/register")
	public String index() {
		return "index";
	}

	@RequestMapping("/registering")

	public String registering(RegisterModel rm, ModelMap mm) {

		rd.register(rm);

		System.out.println(rm.getfName());
		System.out.println(rm.getfName());
		System.out.println(rm.getEmail());
		System.out.println(rm.getAddress());

		return "index";

	}

	@RequestMapping("/test")
	public Integer Test() {
		return 100;
	}
}
