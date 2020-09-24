package com.prepared.pProject.controller;

import com.prepared.pProject.entity.SysDepartment;
import com.prepared.pProject.service.SysDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @version 1.0
 * @Auther: z2010
 * @Date: 2019/11/29 15:43
 * @Description:
 */
@Controller
@RequestMapping("department")
public class SysDepartmentController {

	@Autowired
	private SysDepartmentService sysDepartmentService;

	@RequestMapping("/getDep")
	public List<SysDepartment> getDepartment(@RequestParam("depId") String depId) {
		return sysDepartmentService.selectSimpleDepartmentsById(depId);
	}
}
