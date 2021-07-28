package com.lti.group.group.service;
import org.springframework.stereotype.Repository;

import com.lti.group.group.service.model.AdminGroups;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
@Repository
public interface GroupRepository extends PagingAndSortingRepository<AdminGroups, Long>{
	

}
