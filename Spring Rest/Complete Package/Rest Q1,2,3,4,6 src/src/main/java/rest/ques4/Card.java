<<<<<<< HEAD
package rest.ques4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Card {
	CardFilter filter = new CardFilter();

	@RequestMapping(value = "/validateCard/{num}", method = RequestMethod.GET)
	public String validation(@PathVariable("num") long num) {
		return filter.cardValidation(num);
	}

}
=======
package rest.ques4;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Card {
	CardFilter filter = new CardFilter();

	@RequestMapping(value = "/validateCard/{num}", method = RequestMethod.GET)
	public String validation(@PathVariable("num") long num) {
		return filter.cardValidation(num);
	}

}
>>>>>>> 70a1007e90fe36b5cee7eb1125c791b282f231c5
