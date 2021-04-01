package haugv.hast.dao;

import haugv.hast.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-10:07 下午
 */
@Mapper
public interface UserDao {

    @Select(
            "select id,login_name,password,email,phone from user " +
            "where login_name=#{loginName} " +
            "and password=#{password}"
    )
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "login_name", property = "loginName"),
            @Result(column = "password", property = "password"),
            @Result(column = "email", property = "email"),
            @Result(column = "phone", property = "phone")
    })
    User doLogin(@Param("loginName") String loginName, @Param("password") String password);

    @Update(
            "update user set " +
            "login_name=#{user.loginName},"+
            "password=#{user.password}," +
            "email=#{user.email}," +
            "phone=#{user.phone}" +
            "where id=#{user.id}"
    )
    int updateUser(@Param("user") User user);

    @Insert("insert into user(login_name,password,email,phone)" +
            "values(#{user.loginName},#{user.password},#{user.email},#{user.phone})")
    int createUser(@Param("user") User user);

    @Delete("delete from user where id=#{id} limit 1")
    int deleteUser(@Param("id") int id);
}
