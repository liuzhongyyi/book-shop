package com.lzy.service;



import com.lzy.domain.Users;



public interface UserService {
    public Users login(String username,String password);
    public int register(Users user);
    public Users findUserByName(String username);

}
