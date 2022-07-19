package com.azizyelbay.reportservice.repository;

import com.azizyelbay.reportservice.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReportRepository extends JpaRepository<Report, Long> {
}
