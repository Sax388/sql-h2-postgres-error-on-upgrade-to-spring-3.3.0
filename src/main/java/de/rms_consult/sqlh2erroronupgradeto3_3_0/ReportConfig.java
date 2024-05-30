package de.rms_consult.sqlh2erroronupgradeto3_3_0;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  @Column(name = "period_type")
  private String periodType;
}
