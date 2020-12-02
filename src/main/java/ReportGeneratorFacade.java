import generators.HtmlReport;
import generators.JavaObjectReport;

import java.util.Arrays;
import java.util.List;

public class ReportGeneratorFacade{



    public static void main(String[] args) {
        HtmlReport htmlReport = new HtmlReport();
        JavaObjectReport objectReport = new JavaObjectReport();

        System.out.println(objectReport.getTotalTestRun());
        System.out.println(objectReport.getPassed());
        System.out.println(objectReport.getFailed());
        System.out.println(objectReport.getAverageDuration());

//        System.out.println(Arrays.toString(new List[]{htmlReport.getReport()}));

    }
}
