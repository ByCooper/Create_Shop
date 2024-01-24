package ru.skypro.homework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.skypro.homework.model.Ad;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdsDTO {

    private int count;
    private List<Ad> results;
}
