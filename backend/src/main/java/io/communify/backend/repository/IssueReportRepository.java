package io.communify.backend.repository;

import io.communify.backend.entity.IssueReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IssueReportRepository extends JpaRepository<IssueReport, UUID> {

}
