package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.ums.entity.Permission;
import com.atguigu.gmall.ums.mapper.PermissionMapper;
import com.atguigu.gmall.ums.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author ybn
 * @since 2020-02-27
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
