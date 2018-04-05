package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.PermissionDao;
import com.logistics.module.bos.dao.RolePermissionDao;
import com.logistics.module.bos.dao.UserRoleDao;
import com.logistics.module.bos.model.TPermission;
import com.logistics.module.bos.model.TRole;
import com.logistics.module.bos.model.TRolePermissionKey;
import com.logistics.module.bos.model.TUserRoleKey;
import com.logistics.module.dto.PermissionDTO;
import com.logistics.module.dto.RoleDTO;
import com.logistics.module.service.PermissionService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:22:11
* 
*/
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	UserRoleDao userRoleDao;
	
	@Autowired
	RolePermissionDao rolePermissionDao;
	
	@Autowired
	PermissionDao permissionDao;

	@Override
	public List<PermissionDTO> findByUserId(int userId) {
		
		List<PermissionDTO> results = new ArrayList<>();
		if(userId == 1001){
			List<TPermission> permissions = permissionDao.queryAll();
			if(!CollectionUtils.isEmpty(permissions)){
				results = convertPoToDto(permissions);
			}
		}else{
			List<TUserRoleKey> userRoles = userRoleDao.selectByUserId(userId);
			if(CollectionUtils.isEmpty(userRoles)){
				return null;
			}else{
				for (TUserRoleKey userRole : userRoles) {
					List<TRolePermissionKey> rolePermissions = rolePermissionDao.selectByRoleId(userRole.getcRoleId());
					if(!CollectionUtils.isEmpty(userRoles)){
						for (TRolePermissionKey rolePermission : rolePermissions) {
							TPermission permission = permissionDao.selectByPrimaryKey(rolePermission.getcPermissionId());
							if(permission != null){
								PermissionDTO dto = new PermissionDTO();
								BeanUtils.copyProperties(permission, dto);
								results.add(dto);
							}
						}
					}
					
				}
			}
		}
		return results;
	}
	
	private List<PermissionDTO> convertPoToDto(List<TPermission> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<PermissionDTO> targetList = new ArrayList<PermissionDTO>();
		for (TPermission po : list) {
			PermissionDTO dto = new PermissionDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

}