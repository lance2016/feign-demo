package com.lance.springboot.repository;


import com.lance.springboot.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 2017/1/10.
 */
//Spring data Rest风格
public interface SysUserRepository extends JpaRepository<SysUser, Long> {


    SysUser getByUsername(String username);

    SysUser findSysUserById(Long id);
}
