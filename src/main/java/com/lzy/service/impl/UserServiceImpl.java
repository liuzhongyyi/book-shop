package com.lzy.service.impl;

import com.lzy.dao.Userdao;
import com.lzy.domain.Users;
import com.lzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private Userdao userdao;
    @Override
    public Users login(String username, String password) {
        String encryptionPassword = DigestUtils.md5DigestAsHex(password.getBytes());
        return userdao.findUsersByUsernameAndPassword(username,encryptionPassword);
    }

    @Override
    public int register(Users user) {
        String password = user.getPassword();
        String encryptionPassword = DigestUtils.md5DigestAsHex(password.getBytes());
        user.setPassword(encryptionPassword);
        return  userdao.save(user)==null?0:1;
    }

    @Override
    public Users findUserByName(String username) {
        return userdao.findUsersByUsername(username);
    }
}
