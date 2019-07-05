package com.lv.cloud.controller;


import com.lv.cloud.service.RefactorUserServiceFeignClient;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author LvNing
 * @since 2019-06-12
 */
@RestController
@RequestMapping("/api/v1/feign/user")
@Slf4j
public class UserController {

    @Autowired
    RefactorUserServiceFeignClient refactorUserServiceFeignClient;

    @ApiOperation(value = "查询所有用户信息", response = Object.class)
    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object queryAll() {
        return refactorUserServiceFeignClient.queryAll();

    }


}
