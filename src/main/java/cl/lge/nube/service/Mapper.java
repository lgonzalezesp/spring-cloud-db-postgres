package cl.lge.nube.service;

import cl.lge.nube.entity.User;
import cl.lge.nube.model.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class Mapper {


    public  UserDTO fromUserToUserDTO(User user){

        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setPassword(user.getPassword());
        userDTO.setUsername(user.getPassword());
        return userDTO;

    }


    public  User fromUserDTOToUser(UserDTO userDto){

       User user = new User();
       user.setName(userDto.getName());
       user.setPassword(userDto.getPassword());
       user.setUsername(userDto.getUsername());
       return user;

    }
}
