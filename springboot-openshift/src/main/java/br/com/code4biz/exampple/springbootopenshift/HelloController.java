package br.com.code4biz.exampple.springbootopenshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String olaMundo(){
		return "Ola OpenShift";
	}

}
