package de.rms_consult.sqlh2erroronupgradeto3_3_0;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

  @Autowired ReportConfigRepository reportConfigRepository;

  @Test
  void contextLoads() {}

  @Test
  void saveToRepository() {
    reportConfigRepository.save(new ReportConfig());
    reportConfigRepository.findAll();
  }
}
