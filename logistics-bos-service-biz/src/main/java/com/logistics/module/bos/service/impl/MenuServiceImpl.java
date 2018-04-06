package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.MenuDao;
import com.logistics.module.bos.dao.RoleMenuDao;
import com.logistics.module.bos.dao.UserDao;
import com.logistics.module.bos.dao.UserRoleDao;
import com.logistics.module.bos.model.TMenu;
import com.logistics.module.bos.model.TRoleMenuKey;
import com.logistics.module.bos.model.TUser;
import com.logistics.module.bos.model.TUserRoleKey;
import com.logistics.module.dto.MenuDTO;
import com.logistics.module.service.MenuService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午5:23:53
* 
*/
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuDao menuDao;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	UserRoleDao userRoleDao;
	
	@Autowired
	RoleMenuDao roleMenuDao;
	
	@Override
	public List<MenuDTO> findByUserId(int userId) {
		
		List<MenuDTO> results = new ArrayList<>();
		TUser user = userDao.selectByPrimaryKey(userId);
		if(user != null){
			if(user.getcStation().equals("1")){
				List<TMenu> menus = menuDao.queryAll();
				if(!CollectionUtils.isEmpty(menus)){
					results = convertPoToDto(menus);
				}
			}else{
				List<TUserRoleKey> userRoles = userRoleDao.selectByUserId(userId);
				if(CollectionUtils.isEmpty(userRoles)){
					return null;
				}else{
					for (TUserRoleKey userRole : userRoles) {
						List<TRoleMenuKey> roleMenus = roleMenuDao.selectByRoleId(userRole.getcRoleId());
						if(!CollectionUtils.isEmpty(roleMenus)){
							for (TRoleMenuKey roleMenu : roleMenus) {
								TMenu menu = menuDao.selectByPrimaryKey(roleMenu.getcMenuId());
								if(menu != null){
									MenuDTO dto = new MenuDTO();
									BeanUtils.copyProperties(menu, dto);
									results.add(dto);
								}
							}
						}
						
					}
				}
			}
		}
		return results;
	}

	@Override
	public int queryTotal() {
		return menuDao.queryTotal();
	}

	@Override
	public List<MenuDTO> queryByPage(int pageNum, int pageSize) {
		List<TMenu> results = menuDao.queryByPage(pageNum, pageSize);
		List<MenuDTO> convert = convertPoToDto(results);
		return convert;
	}

	private List<MenuDTO> convertPoToDto(List<TMenu> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<MenuDTO> targetList = new ArrayList<MenuDTO>();
		for (TMenu po : list) {
			MenuDTO dto = new MenuDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}
	
	@Override
	public int insertSelective(MenuDTO record) {
		TMenu menu = new TMenu();
		BeanUtils.copyProperties(record, menu);
		return menuDao.insertSelective(menu);
	}

	@Override
	public int queryMaxId() {
		return menuDao.queryMaxId();
	}

	@Override
	public List<MenuDTO> queryAll() {
		List<TMenu> results = menuDao.queryAll();
		List<MenuDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int deleteSelect(int id) {
		return menuDao.deleteSelect(id);
	}

}
