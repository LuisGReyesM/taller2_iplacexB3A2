package com.bdd;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "classpath:features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.bdd.steps,com.bdd.config")
public class RunCucumberTest {
    // Esta clase es el punto de entrada para ejecutar tus pruebas BDD.
}