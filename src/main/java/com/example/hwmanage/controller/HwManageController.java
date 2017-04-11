package com.example.hwmanage.controller;

import org.springframework.ui.Model;

import com.example.hwmanage.form.HwManageForm;

/**
 * コントローラインターフェース.
 * 
 * @author saitoshu
 *
 */
public interface HwManageController {

	HwManageForm setupForm();

	String init(Model model);

}