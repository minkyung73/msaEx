package msaex.common;

import io.cucumber.spring.CucumberContextConfiguration;
import msaex.OutHelloApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OutHelloApplication.class })
public class CucumberSpingConfiguration {}
