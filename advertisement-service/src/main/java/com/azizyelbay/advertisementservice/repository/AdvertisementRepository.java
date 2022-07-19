package com.azizyelbay.advertisementservice.repository;

import com.azizyelbay.advertisementservice.model.Advertisement;
import com.azizyelbay.advertisementservice.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    List<Advertisement> findByStatus(Status status);
    List<Advertisement> findByActiveFalse();

    @Query(nativeQuery=true, value="SELECT * FROM advertisements WHERE status = 'APPROVED' ORDER  BY created_at DESC Limit 10;")
    List<Advertisement> findLast10ApprovedAdvertisements();
}
