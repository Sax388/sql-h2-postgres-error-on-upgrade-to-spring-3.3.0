package de.rms_consult.sqlh2erroronupgradeto3_3_0;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/** Entity for a report configuration. */
@Entity
@Table(name = "report_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportConfig {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "created")
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private ZonedDateTime created;

  @Column(name = "updated")
  @DateTimeFormat(iso = ISO.DATE_TIME)
  private ZonedDateTime updated;

  @Column(name = "file_name")
  private String fileName;

  @Enumerated(EnumType.STRING)
  @Column(name = "period_type", columnDefinition = "varchar(255)")
  private PeriodType periodType;
}
