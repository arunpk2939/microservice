package com.lti.group.group.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.group.group.service.model.AdminGroups;
import com.lti.group.group.service.model.BaseResponse;
@Service
public class GroupService {
	@Autowired
	GroupRepository groupRepository;
	public List<AdminGroups> getAllGroups() {
		List<AdminGroups> target = new ArrayList<>();
		groupRepository.findAll().forEach(target::add);
		return target;
	}
	public BaseResponse addGroup(AdminGroups adminGroup) {
		BaseResponse baseResponse = new BaseResponse();
		try{
			if(adminGroup.getStatus() != null && adminGroup.getStatus().equalsIgnoreCase("I")){
				
			}else{
				adminGroup.setStatus("A");
			}
			groupRepository.save(adminGroup);
			baseResponse.setCode(0);
			baseResponse.setResult("SUCCESS");
		}catch(Exception ex){
			baseResponse.setCode(5);
			baseResponse.setResult("ERROR");
		}
		return baseResponse;
	}
	public BaseResponse updateGroup(AdminGroups adminGroup) {
		return addGroup(adminGroup);
	}
	public AdminGroups getGroupById(long groupId) {
		return groupRepository.findById(groupId).orElse(null);
		
	}
	public BaseResponse deleteGroup(long groupId) {
		BaseResponse baseResponse = new BaseResponse();
		AdminGroups adminGroup = groupRepository.findById(groupId).orElse(null);
		if(adminGroup != null){
		adminGroup.setStatus("I");
		baseResponse = addGroup(adminGroup);
		}else{
			baseResponse.setCode(5);
			baseResponse.setResult("Id is null");	
		}
		return baseResponse;
	}
}
