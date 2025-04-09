package io.communify.backend.service;

import io.communify.backend.entity.IssueReport;
import io.communify.backend.repository.IssueReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueReportService {
    private final IssueReportRepository repo;

    public IssueReportService(IssueReportRepository repo){
        this.repo = repo;
    }

    public IssueReport create(IssueReport report){
        return repo.save(report);
    }

    public List<IssueReport> getAll() {
        return repo.findAll();
    }


}
