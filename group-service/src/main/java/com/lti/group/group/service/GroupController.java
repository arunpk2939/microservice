package com.lti.group.group.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.group.group.service.model.AdminGroups;
import com.lti.group.group.service.model.BaseResponse;
import com.lti.group.group.service.model.GroupModel;



@RestController
@RequestMapping(value = "/api")
public class GroupController {
	@Autowired
	GroupService groupService;
	@GetMapping("/getGroup/{groupId}")
	public AdminGroups getGroupById(@PathVariable(name = "groupId") long groupId){
		return groupService.getGroupById(groupId);
	}
	@GetMapping("/getAllGroups")
	public List<AdminGroups> getAllGroups(){
		return groupService.getAllGroups();
	}
	@PostMapping("/addGroup")
	public @ResponseBody BaseResponse addGroup(@RequestBody AdminGroups adminGroup){
		return groupService.addGroup(adminGroup);
	}
	@PostMapping("/updateGroup")
	public @ResponseBody BaseResponse updateGroup(@RequestBody AdminGroups adminGroup){
		return groupService.updateGroup(adminGroup);
	}
	@PostMapping("/deleteGroup/{groupId}")
	public @ResponseBody BaseResponse deleteGroup(@PathVariable(name = "groupId") long groupId){
		return groupService.deleteGroup(groupId);
	}
}
