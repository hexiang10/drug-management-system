package com.college.wms.dao;

import com.college.wms.domain.RolePermissionDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色权限信息 Mapper

 */
@Repository
public interface RolePermissionMapper {

    List<RolePermissionDO> selectAll();
}
