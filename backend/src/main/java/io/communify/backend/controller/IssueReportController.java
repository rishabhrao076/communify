package io.communify.backend.controller;

import io.communify.backend.entity.IssueReport;
import io.communify.backend.service.IssueReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueReportController {
    private final IssueReportService service;

    public IssueReportController(IssueReportService service){
        this.service = service;
    }

    @GetMapping
    public List<IssueReport> getAllIssues(){
        return service.getAll();
    }

}
