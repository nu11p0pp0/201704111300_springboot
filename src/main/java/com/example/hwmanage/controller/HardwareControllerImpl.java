/**
 * 
 */
package com.example.hwmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.hwmanage.form.HwManageForm;
import com.example.hwmanage.models.MFloor;
import com.example.hwmanage.models.MHardware;
import com.example.hwmanage.models.repository.MHardwareRepository;

/**
 * @author saitoshu
 *
 */
@Controller
@RequestMapping(path = "/hardware")
public class HardwareControllerImpl implements HwManageController {

	@Autowired
	protected MHardwareRepository mHardwareRepository;

	@Override
	@ModelAttribute
	public HwManageForm setupForm() {
		return null;
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public String init(Model model) {
		Iterable<MHardware> mHardwares = mHardwareRepository.findAll();
		model.addAttribute("hardwares", mHardwares);
		model.addAttribute("hardwareForm", setupForm());
		return "hardware";
	}

}
