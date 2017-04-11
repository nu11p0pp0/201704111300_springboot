/**
 * 
 */
package com.example.hwmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author saitoshu
 *
 */
@Controller
public class IndexController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
}
