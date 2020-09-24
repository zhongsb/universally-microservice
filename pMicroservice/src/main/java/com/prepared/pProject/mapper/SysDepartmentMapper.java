package com.prepared.pProject.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.prepared.pProject.entity.SysDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 机构表 Mapper 接口
 * </p>
 *
 * @author Gensokyo V.L.
 * @since 2017-07-31
 */
@Mapper
public interface SysDepartmentMapper extends BaseMapper<SysDepartment> {


	/**
	 * 查询部门及其子部门列表（编号为空是查询全部）
	 *
	 * @param deptId 指定部门编号
	 * @return 部门列表
	 */
	List<SysDepartment> selectDepartmentWithChildren(@Param("deptId") String deptId);


}
