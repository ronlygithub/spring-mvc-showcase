package org.springframework.samples.mvc.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	@RequestMapping("/simple")
	public @ResponseBody String simple() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("---------------"+Thread.currentThread().getName()+"-----------------");
		return "Hello world!";
	}

}
