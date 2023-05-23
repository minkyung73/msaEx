package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext50Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext50Application.class })
public class CucumberSpingConfiguration {}
