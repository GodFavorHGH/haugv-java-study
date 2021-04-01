package haugv.hast.controller;

import haugv.hast.common.JSONResult;
import haugv.hast.entity.User;
import haugv.hast.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-10:21 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping("/login")
    public JSONResult getUser(@RequestParam("loginName") String loginName, @RequestParam("password") String password){
        User user = userService.doLogin(loginName, password);
        return user != null ? new JSONResult(200, "查询成功！", user) : new JSONResult(444, "用户不存在！");
    }

    @PostMapping("/update")
    public JSONResult updateUser(@RequestBody User user){
        int count = userService.updateUser(user);
        return count == 1 ? new JSONResult(200, "信息更新成功！") : new JSONResult(999, "信息更新失败！");
    }

    @PostMapping("/create")
    public JSONResult createUser(@RequestBody User user){
        int count = userService.createUser(user);
        return count == 1 ? new JSONResult(200, "用户创建成功！") : new JSONResult(444, "用户创建失败！");
    }

    @GetMapping("/delete")
    public JSONResult deleteUser(@RequestParam("id") int id){
        int count = userService.deleteUser(id);
        return count == 1 ? new JSONResult(200, "用户删除成功！") : new JSONResult(444, "用户删除失败！");
    }
}
