package com.azizyelbay.reportservice.dto.converter;

import com.azizyelbay.reportservice.dto.ReportDto;
import com.azizyelbay.reportservice.model.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportDtoConverter {
    public ReportDto convert(Report from) {
        return new ReportDto(from.getId(),
                from.getAdvertisementId(),
                from.getUserName(),
                from.getVisitCounter(),
                from.getReportText()
        );
    }
}
