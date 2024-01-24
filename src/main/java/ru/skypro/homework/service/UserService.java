package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPasswordDTO;
import ru.skypro.homework.dto.UpdateUserDTO;
import ru.skypro.homework.model.User;

@Service
public interface UserService {
    UpdateUserDTO updateUser(UpdateUserDTO updateUserDTO);
    NewPasswordDTO updatePassword(NewPasswordDTO newPasswordDTO, String name);
    User getUserMe(String name);


}
