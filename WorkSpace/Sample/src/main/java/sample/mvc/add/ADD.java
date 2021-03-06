package sample.mvc.add;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ADD {

	@RequestMapping("/Calculate")
	public ModelAndView add(@Valid @ModelAttribute("Number") Number number, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView view = new ModelAndView("index");
			return view;
		}

		ModelAndView view = new ModelAndView("add");
		double add = number.Number1 + number.Number2;
		view.addObject("add", add);
		view.addObject("opp", number.operation);
		return view;
	}
}
