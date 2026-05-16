package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if(extent == null) {

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(
                            "reports/AutomationReport.html");

            reporter.config().setReportName(
                    "KRAVIX Automation Report");

            reporter.config().setDocumentTitle(
                    "Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(reporter);

            extent.setSystemInfo(
                    "Tester", "Spoorthi");
        }

        return extent;
    }
}