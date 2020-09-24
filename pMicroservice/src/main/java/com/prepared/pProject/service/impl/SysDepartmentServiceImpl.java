package com.prepared.pProject.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.prepared.pProject.annotation.DataSource;
import com.prepared.pProject.config.commons.Database;
import com.prepared.pProject.entity.SysDepartment;
import com.prepared.pProject.mapper.SysDepartmentMapper;
import com.prepared.pProject.service.SysDepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 机构表 服务实现类
 * </p>
 *
 * @author z2010
 * @since 2019-11-29
 */
@Service
@DataSource(db = Database.SECOND)
public class SysDepartmentServiceImpl extends ServiceImpl<SysDepartmentMapper, SysDepartment> implements SysDepartmentService {

	/**
	 * 根据部门编号获取部门列表（当部门编号为空时获取所有部门）
	 *
	 * @param deptId 部门编号
	 * @return 部门列表
	 */
	@Override
	@DataSource(db = Database.FIRST)
	public List<SysDepartment> selectSimpleDepartmentsById(String deptId) {
		List<SysDepartment> departments = baseMapper.selectDepartmentWithChildren(deptId);
		return departments;
	}


}
