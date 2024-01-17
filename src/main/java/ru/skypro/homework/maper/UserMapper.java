package ru.skypro.homework.maper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userDTOToUser(UserDTO user);
    UserDTO userToUserDTO(User model);
    User updateUserDTOToUser(UpdateUserDTO user);
    UpdateUserDTO userToupdateUserDTO(User model);
    User loginDTOToUser(LoginDTO user);
    LoginDTO userTologinDTO(User model);
    User newPasswordDTOToUser(NewPasswordDTO user);
    NewPasswordDTO UserTonewPasswordDTO(NewPasswordDTO user);
    User registerDTOToUser(RegisterDTO user);
    RegisterDTO userToregisterDTO(User model);
}
