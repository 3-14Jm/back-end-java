package com.fox.mapper;

import com.fox.DTO.UserDTO;
import com.fox.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDTO> {
    @Override
    public UserDTO mapObjectToDto(User user) {
        if (user == null) return null;

        UserDTO.UserDTOBuilder userDTOBuilder = UserDTO.builder();
        userDTOBuilder.id(user.getId());
        userDTOBuilder.surname(user.getSurname());
        userDTOBuilder.name(user.getName());
        userDTOBuilder.email(user.getEmail());
        userDTOBuilder.gender(user.getGender());
        userDTOBuilder.birthday(user.getBirthday());
        userDTOBuilder.login(user.getLogin());
        userDTOBuilder.password(user.getPassword());

        return userDTOBuilder.build();
    }
}
