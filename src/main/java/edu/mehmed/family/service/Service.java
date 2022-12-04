package edu.mehmed.family.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.mehmed.family.dto.FamilyDto;
import edu.mehmed.family.entity.FamilyEntity;
import edu.mehmed.family.repository.Repository;

@Component
public class Service {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private Repository repository;
	
	
	public void processFamilyDetails(FamilyDto dto)
	{
		FamilyEntity familyEntity = modelMapper.map(dto, FamilyEntity.class);
		repository.saveFamilyDetails(familyEntity);
	}
	
	public List<FamilyEntity> getFamilyDetails()
	{
		return repository.findAllFamilyDetails();
	}
}
