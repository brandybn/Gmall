package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.ums.entity.Member;
import com.atguigu.gmall.ums.mapper.MemberMapper;
import com.atguigu.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author ybn
 * @since 2020-02-27
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}