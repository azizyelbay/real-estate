package com.azizyelbay.advertisementservice.dto;

import com.azizyelbay.advertisementservice.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdvertisementStatusRequest {

    private String status;
}
