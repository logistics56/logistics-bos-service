package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.RoleDao;
import com.logistics.module.bos.dao.UserDao;
import com.logistics.module.bos.dao.UserRoleDao;
import com.logistics.module.bos.model.TRole;
import com.logistics.module.bos.model.TUser;
import com.logistics.module.bos.model.TUserRoleKey;
import com.logistics.module.dto.RoleDTO;
import com.logistics.module.service.RoleService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:02:12
* 
*/
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleDao roleDao;
	
	@Autowired
	UserRoleDao userRoleDao;
	
	@Autowired
	UserDao userDao;

	@Override
	public List<RoleDTO> findByUserId(int userId) {
		
		List<RoleDTO> results = new ArrayList<>();
		TUser user = userDao.selectByPrimaryKey(userId);
		if(user != null){
			if(user.getcStation().equals("1")){//管理员查询所有
				List<TRole> roles = roleDao.queryAll();
				if(!CollectionUtils.isEmpty(roles)){
					results = convertPoToDto(roles);
				}
			}else{
				List<TUserRoleKey> userRoles = userRoleDao.selectByUserId(userId);
				if(CollectionUtils.isEmpty(userRoles)){
					return null;
				}else{
					for (TUserRoleKey userRole : userRoles) {
						TRole role = roleDao.selectByPrimaryKey(userRole.getcRoleId());
						if(role != null){
							RoleDTO roleDto = new RoleDTO();
							BeanUtils.copyProperties(role, roleDto);
							results.add(roleDto);
						}
						
					}
				}
			}
		}
		return results;
	}
	
	private List<RoleDTO> convertPoToDto(List<TRole> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<RoleDTO> targetList = new ArrayList<RoleDTO>();
		for (TRole po : list) {
			RoleDTO dto = new RoleDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int queryTotal() {
		return roleDao.queryTotal();
	}

	@Override
	public List<RoleDTO> queryByPage(int pageNum, int pageSize) {
		List<TRole> results = roleDao.queryByPage(pageNum, pageSize);
		List<RoleDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int insertSelective(RoleDTO record) {
		TRole role = new TRole();
		BeanUtils.copyProperties(record, role);
		return roleDao.insertSelective(role);
	}

	@Override
	public int queryMaxId() {
		return roleDao.queryMaxId();
	}

	@Override
	public List<RoleDTO> queryAll() {
		List<TRole> results = roleDao.queryAll();
		List<RoleDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int deleteSelect(int id) {
		return roleDao.deleteSelect(id);
	}

}
