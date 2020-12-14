package com.marcuschiu.swaggerexample.controller;

import com.marcuschiu.swaggerexample.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "From @Api.value", tags = {"From @Api.tags - tag 1", "From @Api.tags - tag 2"})
@RestController
@RequestMapping("/default/1")
public class Default1Controller {

    @ApiOperation(value = "This is from @ApiOperation")
    @GetMapping("/")
    public User get() {
        return new User(1l, "Marcus", 18, "marcuschiu9@gmail.com");
    }

    @ApiOperation("This is from @ApiOperation")
    @PostMapping("/")
    public User post(@RequestBody User user) {
        return user;
    }
}
