package ru.skypro.homework.maper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.model.User;
//@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    User userDTOToUser(UserDTO user);
    UserDTO userToUserDTO(User model);
    User updateUserDTOToUser(UpdateUserDTO user);
    UpdateUserDTO userToupdateUserDTO(User model);
    User loginDTOToUser(LoginDTO user);
    LoginDTO userTologinDTO(User model);
    User newPasswordDTOToUser(NewPasswordDTO user);
    NewPasswordDTO userTonewPasswordDTO(User model);
    User registerDTOToUser(RegisterDTO user);
    RegisterDTO userToregisterDTO(User model);
}
