package cl.lge.nube.controller;

import cl.lge.nube.model.UserDTO;
import cl.lge.nube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {


        return new ResponseEntity<UserDTO>(userService.addUser(userDTO), HttpStatus.OK);
    }

}
