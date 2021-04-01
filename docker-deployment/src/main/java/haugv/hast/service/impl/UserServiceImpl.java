package haugv.hast.service.impl;

import haugv.hast.dao.UserDao;
import haugv.hast.entity.User;
import haugv.hast.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-10:24 下午
 */
@Component
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User doLogin(String loginName, String password) {
        return userDao.doLogin(loginName, password);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int createUser(User user) {
        return userDao.createUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

}
