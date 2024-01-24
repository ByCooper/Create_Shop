package ru.skypro.homework.maper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.dto.AdsDTO;
import ru.skypro.homework.dto.CreateOrUpdateAdDTO;
import ru.skypro.homework.dto.ExtendedAdDTO;
import ru.skypro.homework.model.Ad;

@Mapper(componentModel = "spring", uses = {UserMapper.class, CommentMapper.class})
public interface AdMapper {
    Ad adDTOtoAd(AdDTO adDTO);
    AdDTO adToAdDTO(Ad model);
    Ad adsDTOToAd(AdsDTO adsDTO);
    AdsDTO adToAdsDTO(Ad model);
    Ad createOrUpdateDTOToAd(CreateOrUpdateAdDTO createOrUpdateAdDTO);
    CreateOrUpdateAdDTO adToCreateOrUpdateDTO(Ad model);
    Ad extendedAdDTOToAd(ExtendedAdDTO extendedAdDTO);
    ExtendedAdDTO adToExtendedAdDTO(Ad model);
}

//@Mapping(target = "data", expression = "java(file.getBytes())")