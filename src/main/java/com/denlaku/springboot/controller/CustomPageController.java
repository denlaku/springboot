package com.denlaku.springboot.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@RequestMapping("/custom-page")
public class CustomPageController {

	@RequestMapping("/{id}/{name:.+}")
	public void index(@PathVariable("id") String id, @PathVariable("name") String name) throws IOException {
		HttpServletResponse response = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getResponse();
		String dir = "C:\\Users\\tianx\\Desktop\\web";
		Path path = Paths.get(dir, name);
		if (Files.exists(path) && !Files.isDirectory(path)) {
			Files.copy(path, response.getOutputStream());
		} else {
			response.sendError(404);
		}
	}
	
	@RequestMapping("/{id}")
	public void index(@PathVariable("id") String id) throws IOException {
		HttpServletResponse response = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getResponse();
		String dir = "C:\\Users\\tianx\\Desktop\\web";
		Path path = Paths.get(dir, "index.html");
		if (Files.exists(path) && !Files.isDirectory(path)) {
			Files.copy(path, response.getOutputStream());
		} else {
			response.sendError(404);
		}
	}
	
}
