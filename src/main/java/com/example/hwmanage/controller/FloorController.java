/**
 * 
 */
package com.example.hwmanage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.hwmanage.form.FloorForm;
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

	@ModelAttribute
	public FloorForm setupForm() {
		return new FloorForm();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/floor")
	public String init(Model model) {
		Iterable<MFloor> mfloors = mFloorReppository.findAll();
		model.addAttribute("floors", mfloors);
		model.addAttribute("floorForm", setupForm());
		return "floor";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/floor")
	public String save(@Valid FloorForm floorForm, BindingResult result, Model model) {

		if (result.hasErrors()) {
			Iterable<MFloor> mfloors = mFloorReppository.findAll();
			model.addAttribute("floors", mfloors);
			// 初期表示.
			return "floor";
		}

		mFloorReppository.save(toModel(floorForm));
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
