package generators;

import report.ReportGenerator;

import java.io.*;
import java.util.ArrayList;

public class HtmlReport implements ReportGenerator {
    ArrayList<TestFields> header = new ArrayList<>();
    ArrayList<TestFields> report = new ArrayList<>();


    public HtmlReport() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("example.csv")))) {
            String rb = null;
            rb = reader.readLine();
            String[] splitReport = rb.split("," ,-1);
            header.add(new TestFields(splitReport [0], splitReport [1], splitReport [2], splitReport [3]
                    ,splitReport[4], splitReport[5], splitReport[6], splitReport[7]));
            int iteration = 0;
            while ((rb = reader.readLine())!= null){
                if(iteration == 0) {
                    iteration++;
                    continue;
                }
                 splitReport = rb.split("," ,-1);
                report.add(new TestFields(splitReport [0], splitReport [1], splitReport [2], splitReport [3]
                        ,splitReport[4], splitReport[5], splitReport[6], splitReport[7]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public String generateReport() {

        return null;
    }

    public ArrayList<TestFields> getHeader(){
        return header;
    }

    public ArrayList<TestFields> getReport(){
        report.toString().indexOf(1);
        return report;
    }

    @Override
    public String toString() {
        return "HtmlReport{" +
                "report=" + report +
                '}';
    }
}
