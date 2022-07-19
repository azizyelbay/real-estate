package com.azizyelbay.reportservice.controller;

import com.azizyelbay.reportservice.dto.ReportDto;
import com.azizyelbay.reportservice.dto.UpdateReportRequest;
import com.azizyelbay.reportservice.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PutMapping("/{reportId}")
    public ResponseEntity<ReportDto> updateReport (@PathVariable Long reportId, @RequestBody UpdateReportRequest updateReportRequest) {
        return ResponseEntity.ok(reportService.updateReport(reportId, updateReportRequest));
    }
}
