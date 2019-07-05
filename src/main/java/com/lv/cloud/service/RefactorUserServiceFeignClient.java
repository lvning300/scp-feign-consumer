package com.lv.cloud.service;

import com.lv.cloud.UserServiceFeignClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SCP-API-MANAGER")
public interface RefactorUserServiceFeignClient extends UserServiceFeignClient {


}
