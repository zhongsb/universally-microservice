package com.prepared.pProject.config.commons;

/**
 * 数据源枚举
 *
 * @author z2010
 * Version 1.36
 */

public enum Database {

	FIRST("FIRST", "第一个库"),
	SECOND("SECOND", "第二个库");

	private String id;
	private String desc;

	Database(String id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public String id() {
		return id;
	}

	public String desc() {
		return desc;
	}

	@Override
	public String toString() {
		return "{" + String.valueOf(id()) + "=" + desc() + "}";
	}

	//获取指定ID的枚举描述
	public static String getDesc(String id) {
		//所有的枚举值
		Database[] values = values();
		//遍历查找
		for (Database t : values) {
			if (t.id().equals(id)) {
				return t.desc();
			}
		}
		return "";
	}

	//是否包含枚举代码
	public static boolean isExist(String id) {
		//所有的枚举值
		Database[] values = values();
		//遍历查找
		for (Database t : values) {
			if (t.id().equals(id)) {
				return true;
			}
		}
		return false;
	}
}
