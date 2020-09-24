package com.prepared.pProject.annotation;

import com.prepared.pProject.config.commons.Database;

import java.lang.annotation.*;

/**
 * Created by Gensokyo V.L. on 2017/7/29.
 * Version 1.36
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DataSource {

	/**
	 * 设置数据源
	 *
	 * @return 默认设置为易华录应用库
	 */
	Database db() default Database.FIRST;
}
