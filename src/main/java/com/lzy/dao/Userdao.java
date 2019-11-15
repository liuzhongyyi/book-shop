package com.lzy.dao;

import com.lzy.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<Users,Long> {
     Users findUsersByUsernameAndPassword(String username,String passworld);
     Users findUsersByUsername(String username);
     Users findUsersByUserId(Integer id);

}
