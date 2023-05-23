package msaex.common;

import io.cucumber.spring.CucumberContextConfiguration;
import msaex.InHelloApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InHelloApplication.class })
public class CucumberSpingConfiguration {}
