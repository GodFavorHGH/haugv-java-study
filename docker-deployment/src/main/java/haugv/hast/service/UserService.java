package haugv.hast.service;

import haugv.hast.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-10:23 下午
 */
public interface UserService {

    User doLogin(@Param("loginName") String loginName, @Param("password") String password);

    int updateUser(@Param("user") User user);

    int createUser(@Param("user") User user);

    int deleteUser(@Param("id") int id);

}
