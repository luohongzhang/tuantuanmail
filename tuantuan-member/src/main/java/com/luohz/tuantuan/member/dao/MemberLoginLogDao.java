package com.luohz.tuantuan.member.dao;

import com.luohz.tuantuan.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:02:58
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
