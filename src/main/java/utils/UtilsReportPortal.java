package utils;

import com.codeborne.selenide.Screenshots;
import com.epam.reportportal.message.ReportPortalMessage;

import java.io.IOException;

public class UtilsReportPortal {

    public void screenshot() {
        ReportPortalMessage message = null;
        String rpMessage = "";
        try {
            message = new ReportPortalMessage(Screenshots.takeScreenShotAsFile(), rpMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LoggerHelp.logger.info(message);
    }
}
