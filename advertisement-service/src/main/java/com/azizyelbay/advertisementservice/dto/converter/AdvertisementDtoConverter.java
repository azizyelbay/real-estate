package com.azizyelbay.advertisementservice.dto.converter;

import com.azizyelbay.advertisementservice.dto.AdvertisementDto;
import com.azizyelbay.advertisementservice.model.Advertisement;
import org.springframework.stereotype.Component;

@Component
public class AdvertisementDtoConverter {
    public AdvertisementDto convert(Advertisement from) {
        return new AdvertisementDto(from.getId(),
                from.getTitle(),
                from.getPrice(),
                from.getDescription(),
                from.getCreatedAt(),
                from.getUserName(),
                from.getActive(),
                from.getVisitCounter()
        );
    }
}
