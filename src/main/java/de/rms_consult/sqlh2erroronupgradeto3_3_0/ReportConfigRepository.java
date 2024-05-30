package de.rms_consult.sqlh2erroronupgradeto3_3_0;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportConfigRepository extends CrudRepository<ReportConfig, Long> {}
