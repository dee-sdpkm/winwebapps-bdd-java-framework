package com.winwebapps.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@WebApp or @WinApp",
        dryRun = false,
        plugin = {"pretty",
                "summary",
                "html:target/cucumber-report/cucumber-summary-report.html",
                "json:target/cucumber-report/cucumber.json",
                "junit:target/cucumber-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/cucumber-report/rerun.txt"},
        glue = {"com.winwebapps.stepdefs", "com.winwebapps.apphooks"},
        monochrome = true
)
public class TestSuiteRunner {
//    @AfterClass
//    public static void extractTestReports() {
//        String cucumberReportOutputPath = properties.getProperty("test_report_path_cluecumber");
//        String extentReportOutputPath = properties.getProperty("test_report_path_extent");
//        String timeStampFormat = properties.getProperty("test_report_timestamp_format");
//        Helper.renameFileOrFilePathWithDateTimeStamp(cucumberReportOutputPath, timeStampFormat, "", "");
////        Helper.renameFileOrFilePathWithDateTimeStamp(extentReportOutputPath, timeStampFormat, "", "");
//    }
}

