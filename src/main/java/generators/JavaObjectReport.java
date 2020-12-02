package generators;

import report.ReportGenerator;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class JavaObjectReport implements ReportGenerator {

    int totalTestRun;
    int passed;
    int failed;
    double averageDuration;

        ArrayList<TestFields> report = new ArrayList<>();


        public JavaObjectReport() {
            try (BufferedReader reader = new BufferedReader(new FileReader(new File("example.csv")))) {
                String rb = null;
                int iteration = 0;
                while ((rb = reader.readLine())!= null){
                    if(iteration == 0) {
                        iteration++;
                        continue;
                    }
                    String[] splitReport = rb.split("," ,-1);
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

        public int getTotalTestRun(){
            totalTestRun = report.size();
            return totalTestRun;
        }

        public int getPassed(){
            passed = 0;
            for (TestFields line: report) {
                if (line.getResult().equals("SUCCESS")){
                    passed++;
                }

            }
            return passed;

        }

        public int getFailed(){
            failed = 0;
            for (TestFields line: report) {
                if (line.getResult().equals("FAILURE")){
                    failed++;
                }

            }
            return failed;
        }
        public double getAverageDuration(){
            averageDuration = 0;
            for (TestFields line: report) {
                averageDuration = averageDuration + Double.parseDouble(line.getDuration());
            }
            averageDuration = averageDuration/report.size();
            return averageDuration;
        }

    public Object generateReport() {
        return null;
    }
}
