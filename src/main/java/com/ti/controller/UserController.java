package com.ti.controller;

import com.ti.model.entity.User;
import com.ti.model.response.Response;
import com.ti.validator.ParamValidate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 用户controller
 *
 * @author tangjie
 * @version 0.0.1
 * @since 2022/5/2 21:32
 **/
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/getUser")
    public Response<User> getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("唐杰");
        user.setAge(28);
        user.setAddress("江苏省南京市");
        return Response.buildSuccessResponse(user);
    }

    @ParamValidate
    @PostMapping(value = "/updateUser")
    public Response<Object> updateUser(@RequestBody User user) {
        log.info(String.format("修改后的user:[%s]", user));
        return Response.buildSuccessResponse(null);
    }
}
