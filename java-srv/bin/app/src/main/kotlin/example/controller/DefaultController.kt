package example.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.stereotype.Controller

@Controller
class DefaultController
{

  var click :Int = 0

	@GetMapping("/")
	fun getCreate(model: Model): String
	{
		model.addAttribute("click", click)
		return "index"
	}

  @PostMapping("/")
  fun postCreate(model: Model): String
	{
    click++
		model.addAttribute("click", click)
		return "index"
	}

}
