package sample.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorld {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView view = new ModelAndView("helloWorld");
		return view;
	}
}
