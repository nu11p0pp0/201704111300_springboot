/**
 * 
 */
package com.example.hwmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.hwmanage.FloorForm;
import com.example.hwmanage.models.MFloor;
import com.example.hwmanage.models.repository.MFloorReppository;

/**
 * 
 * @author saitoshu
 *
 */
@Controller
public class FloorController {

	@Autowired
	protected MFloorReppository mFloorReppository;

	@RequestMapping(method = RequestMethod.GET, value = "/floor")
	public String init(Model model) {
		Iterable<MFloor> mfloors = mFloorReppository.findAll();
		model.addAttribute("floors", mfloors);
		model.addAttribute("form", new MFloor());
		return "floor";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/floor")
	public String save(@Validated @ModelAttribute MFloor form, BindingResult result, Model model, Errors errors) {

		if (result.hasErrors()) {
			init(model);
			model.addAttribute("form", form);
			// 初期表示.
			return "floor";
		}

		mFloorReppository.save(form);
		// 初期表示.
		return init(model);
	}

	private MFloor toModel(FloorForm form) {
		MFloor mFloor = new MFloor();
		mFloor.setFloorCd(form.getFloorCd());
		mFloor.setFloorName(form.getFloorName());
		return mFloor;
	}
}
