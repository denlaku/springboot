package com.denlaku.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.denlaku.springboot.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

	@Autowired
	private HelloController helloController;

	@Test
	public void testIndex() {
		String index = helloController.index();
		System.out.println(index);
	}
	
	@Test
	public void testHome() {
		String home = helloController.home();
		System.out.println(home);
	}
	
	@Test
	public void testExport() {
		String export = helloController.export("Str");
		System.out.println(export);
		String export2 = helloController.export(null);
		System.out.println(export2);
	}

}
