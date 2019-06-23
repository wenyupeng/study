package com.wen.dao;

import com.wen.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wen
 * @Date: 2019/6/17 23:36
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    SysUser findByUsername(String username);
}
