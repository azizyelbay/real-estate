package com.azizyelbay.advertisementservice.controller;

import com.azizyelbay.advertisementservice.dto.AdvertisementDto;
import com.azizyelbay.advertisementservice.dto.CreateAdvertisementRequest;
import com.azizyelbay.advertisementservice.dto.UpdateAdvertisementRequest;
import com.azizyelbay.advertisementservice.dto.UpdateAdvertisementStatusRequest;
import com.azizyelbay.advertisementservice.service.AdvertisementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/advertisement")
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @PostMapping
    public ResponseEntity<AdvertisementDto> createAdvertisement (@RequestBody CreateAdvertisementRequest createAdvRequest){
        return ResponseEntity.ok(advertisementService.createAdvertisement(createAdvRequest));
    }

    @PutMapping("/{advertisementId}")
    public ResponseEntity<AdvertisementDto> updateAdvertisement (@PathVariable Long advertisementId, @RequestBody UpdateAdvertisementRequest updateAdvRequest) {
        return ResponseEntity.ok(advertisementService.updateAdvertisement(advertisementId, updateAdvRequest));
    }

    // ONLY ADMIN
    @GetMapping("/passive")
    public ResponseEntity<List<AdvertisementDto>> getPassiveAdvertisements() {
        return ResponseEntity.ok(advertisementService.getPassiveAdvertisements());
    }

    // ONLY ADMIN
    @GetMapping("/{status}")
    public ResponseEntity<List<AdvertisementDto>> getAdvertisementsByStatus(@PathVariable String status) {
        return ResponseEntity.ok(advertisementService.getAdvertisementsByStatus(status));
    }

    // ONLY ADMIN
    @PutMapping("/status/{advertisementId}")
    public ResponseEntity<AdvertisementDto> updateAdvertisementStatus (@PathVariable Long advertisementId, @RequestBody UpdateAdvertisementStatusRequest updateAdvStatusRequest) {
        return ResponseEntity.ok(advertisementService.updateAdvertisementStatus(advertisementId, updateAdvStatusRequest));
    }

}
