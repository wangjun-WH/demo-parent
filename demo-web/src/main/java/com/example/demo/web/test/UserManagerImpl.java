package com.example.demo.web.test;

/**
 * @author : wangjun
 * @date : 2022/3/30  10:07
 */
public class UserManagerImpl implements UserManager {

    @Override
    public void addUser(String id, String password) {
        System.out.println("调用了UserManagerImpl.addUser()方法！");
    }

    @Override
    public void delUser(String id) {
        System.out.println("调用了UserManagerImpl.delUser()方法！");
    }
}
