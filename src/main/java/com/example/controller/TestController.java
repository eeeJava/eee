package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * luoxiaojiang
 * 2018年12月10日
 */

@RestController
public class TestController {

	@RequestMapping("/getT")
	public T getT() {
		T user = new T("aa","bb");
		return user;
	}
}
class T{
	private String name;
	private String pass;
	
	/**
	 * @param name
	 * @param pass
	 */
	public T(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}

