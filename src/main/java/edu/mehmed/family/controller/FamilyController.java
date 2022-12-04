package edu.mehmed.family.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mehmed.family.constant.AppConstant;
import edu.mehmed.family.dto.FamilyDto;
import edu.mehmed.family.service.Service;

@Controller
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class FamilyController {

	@Autowired
	private Service service;
	
	
	
	
	FamilyController()
	{
		System.out.println(this.getClass().getSimpleName()+"Object Created !");
	}
	
	@RequestMapping(value=AppConstant.FAMILY_DETAILS)
	public ModelAndView familyDetails(FamilyDto dto)
	{
		System.out.println(dto);
		service.processFamilyDetails(dto);
		return new ModelAndView("display.jsp");
	}
}
