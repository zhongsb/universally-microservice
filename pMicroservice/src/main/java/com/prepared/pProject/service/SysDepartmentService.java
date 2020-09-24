package com.prepared.pProject.service;

import com.baomidou.mybatisplus.service.IService;
import com.prepared.pProject.entity.SysDepartment;

import java.util.List;

/**
 * <p>
 * 机构表 服务类
 * </p>
 *
 * @author Gensokyo V.L.
 * @since 2017-07-31
 */
public interface SysDepartmentService extends IService<SysDepartment> {
	/**
	 * 根据部门编号获取部门列表（当部门编号为空时获取所有部门）
	 *
	 * @param deptId 部门编号
	 * @return 部门列表
	 */
	List<SysDepartment> selectSimpleDepartmentsById(String deptId);
}
