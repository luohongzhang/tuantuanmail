package com.luohz.tuantuan.member.dao;

import com.luohz.tuantuan.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author luohz
 * @email luohongzhangzry@163.com
 * @date 2020-11-01 19:02:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
