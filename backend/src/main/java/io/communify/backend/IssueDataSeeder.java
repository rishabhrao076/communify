package io.communify.backend;

import io.communify.backend.entity.IssueReport;
import io.communify.backend.repository.IssueReportRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class IssueDataSeeder {

    @Bean
    CommandLineRunner initDatabase(IssueReportRepository repository) {
        return args -> {
            // Manually creating and saving 10 entries
            IssueReport issue1 = new IssueReport();
            issue1.setDescription("Street light not working on Main St.");
            issue1.setCategory("Infrastructure");
            issue1.setLatitude(40.7128);
            issue1.setLongitude(-74.0060);
            issue1.setImageUrl("https://example.com/images/issue1.jpg");
            issue1.setReportedAt(LocalDateTime.now().minusDays(1));

            IssueReport issue2 = new IssueReport();
            issue2.setDescription("Broken sidewalk on 5th Avenue");
            issue2.setCategory("Infrastructure");
            issue2.setLatitude(40.7306);
            issue2.setLongitude(-73.9352);
            issue2.setImageUrl("https://example.com/images/issue2.jpg");
            issue2.setReportedAt(LocalDateTime.now().minusDays(2));

            IssueReport issue3 = new IssueReport();
            issue3.setDescription("Pothole near the intersection of Elm and Pine St.");
            issue3.setCategory("Roads");
            issue3.setLatitude(40.7341);
            issue3.setLongitude(-73.9897);
            issue3.setImageUrl("https://example.com/images/issue3.jpg");
            issue3.setReportedAt(LocalDateTime.now().minusDays(3));

            IssueReport issue4 = new IssueReport();
            issue4.setDescription("Garbage collection missed on Oak St.");
            issue4.setCategory("Sanitation");
            issue4.setLatitude(40.7457);
            issue4.setLongitude(-74.0220);
            issue4.setImageUrl("https://example.com/images/issue4.jpg");
            issue4.setReportedAt(LocalDateTime.now().minusDays(4));

            // Add more manually created issues as needed
            IssueReport issue5 = new IssueReport();
            issue5.setDescription("Broken water pipe near the park.");
            issue5.setCategory("Water");
            issue5.setLatitude(40.7560);
            issue5.setLongitude(-73.9821);
            issue5.setImageUrl("https://example.com/images/issue5.jpg");
            issue5.setReportedAt(LocalDateTime.now().minusDays(5));

            // Save all manually created entries to the database
            repository.save(issue1);
            repository.save(issue2);
            repository.save(issue3);
            repository.save(issue4);
            repository.save(issue5);

            System.out.println("Manual entries seeded into the database.");
        };
    }

}

