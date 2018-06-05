package com.yibaijin.service.boot.web.controller.sys;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sys/role/")
@Api
public class SysRoleController {
    @GetMapping("add")
    @ApiOperation("增加")
//    @ApiResponses(
//            {
////                    @ApiResponse(code = 200, message = "asdf", response = String.class),
//                    @ApiResponse(code = 201, message = "啊啊啊啊", response = List.class)}
//    )
    public String add(String aaa) throws Exception {
        return aaa;
    }

}
