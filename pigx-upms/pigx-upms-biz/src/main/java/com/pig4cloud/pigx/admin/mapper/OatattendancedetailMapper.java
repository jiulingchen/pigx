/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pig4cloud.pigx.admin.entity.AtshiftType;
import com.pig4cloud.pigx.admin.entity.AtshiftWork;
import com.pig4cloud.pigx.admin.entity.Oatattendancedetail;
import com.pig4cloud.pigx.admin.entity.Otjob;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 考勤打卡原始表
 *
 * @author gaoxiao
 * @date 2020-06-19 12:11:01
 */
@Mapper
public interface OatattendancedetailMapper extends BaseMapper<Oatattendancedetail> {
	public List<Map> listOatattendancedetailForUser(Map map);
	public AtshiftType listAtshiftTypeForUser(Oatattendancedetail oatattendancedetail);
	//获取今日考勤
	public List<Map> listTodayAttendance(Map map);
}
