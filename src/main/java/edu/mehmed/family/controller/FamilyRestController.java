package edu.mehmed.family.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mehmed.family.constant.AppConstant;
import edu.mehmed.family.dto.FamilyDto;
import edu.mehmed.family.entity.FamilyEntity;
import edu.mehmed.family.service.Service;

/*  @Component
@ResponseBody  */

@RestController
public class FamilyRestController {

	@Autowired
	private Service service;
	
	@GetMapping(value=AppConstant.GET_FAMILY_DETAILS)
	public @ResponseBody List<FamilyEntity> getFamilyDetails(FamilyDto dto)
	{
		List<FamilyEntity> familyDetails = service.getFamilyDetails();
		return familyDetails;
	}
	
	@PostMapping(value=AppConstant.PUT_FAMILY_DETAILS)
	public void saveFamilyDetails(@RequestBody FamilyDto dto)
	{
		service.processFamilyDetails(dto);
	}
}
