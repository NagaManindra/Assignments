/*
 * package mvc.q3.controller;
 * 
 * import org.springframework.validation.BindingResult; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import mvc.q3.login.Login;
 * 
 * @RestController public class LoginController {
 * 
 * @RequestMapping("/login") public ModelAndView login(@ModelAttribute("login")
 * Login login, BindingResult result) { if (result.hasErrors()) { ModelAndView
 * view = new ModelAndView("error"); return view; } ModelAndView view = new
 * ModelAndView("success"); return view; }
 * 
 * }
 */

package mvc.q3.controller;

import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import mvc.q3.login.Login;

@RestController
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(@Valid @ModelAttribute("login") Login in, Errors result) {
		if (result.hasErrors()) {
			ModelAndView view = new ModelAndView("error");
			return view;
		}
		ModelAndView view = new ModelAndView("success");
		view.addObject("name", in.getUsername());
		view.addObject("pass", in.getPassword());
		view.addObject("mail", in.getEmail());
		return view;
	}

}
