/**
 * 
 */
package com.example.hwmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.hwmanage.form.HwManageForm;

/**
 * @author saitoshu
 *
 */
@Controller
@RequestMapping(path = "/")
public class IndexController implements HwManageController {

	@Override
	public HwManageForm setupForm() {
		return null;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String init(Model model) {
		return "index";
	}

}
