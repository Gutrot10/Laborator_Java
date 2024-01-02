import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String csvFile = "src/YaleAdmits.csv";


        Thread csvThread = new Thread(() -> {
            List<YaleAdmitsData> dataList = readCSV(csvFile);


            Collections.sort(dataList);
            for (YaleAdmitsData data : dataList) {
                System.out.println(data);
            }
        });


        csvThread.start();

        try {

            csvThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Main thread continues with other tasks...");
    }

    private static List<YaleAdmitsData> readCSV(String csvFile) {
        List<YaleAdmitsData> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int yearEntered = Integer.parseInt(values[0]);
                int applications = Integer.parseInt(values[1]);
                int admits = Integer.parseInt(values[2]);
                double admitRate = Double.parseDouble(values[3]);
                int matriculare = Integer.parseInt(values[4]);
                double yield = Double.parseDouble(values[5]);
                int verbalScore = getValueOrZero(values[6]);
                int verbal10th = Integer.parseInt(values[7]);
                int verbal25th = Integer.parseInt(values[8]);
                int verbal50th = Integer.parseInt(values[9]);
                int verbal75th = Integer.parseInt(values[10]);
                int verbal90th = Integer.parseInt(values[11]);
                int mathScore = getValueOrZero(values[12]);
                int math10th = Integer.parseInt(values[13]);
                int math25th = Integer.parseInt(values[14]);
                int math50th = Integer.parseInt(values[15]);
                int math75th = Integer.parseInt(values[16]);
                int math90th = Integer.parseInt(values[17]);
                int SAT10 = Integer.parseInt(values[18]);
                int SAT25 = Integer.parseInt(values[19]);
                int SAT50 = Integer.parseInt(values[20]);
                int SAT75 = Integer.parseInt(values[21]);
                int SAT90 = Integer.parseInt(values[22]);
                int legacyCount = Integer.parseInt(values[23]);
                int newHaven = Integer.parseInt(values[24]);
                int newEngland = Integer.parseInt(values[25]);
                int newYorkState = Integer.parseInt(values[26]);
                int EOM = Integer.parseInt(values[27]);
                int WOM = Integer.parseInt(values[28]);
                int US = Integer.parseInt(values[29]);
                int total = Integer.parseInt(values[30]);


                YaleAdmitsData data = new YaleAdmitsData(yearEntered, applications, admits, admitRate,
                        matriculare, yield, verbalScore, verbal10th, verbal25th,
                        verbal50th, verbal75th, verbal90th, mathScore, math10th,
                        math25th, math50th, math75th, math90th, SAT10, SAT25,
                        SAT50, SAT75,SAT90, legacyCount, newHaven, newEngland,
                        newYorkState, EOM, WOM, US, total);
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }
    private static int getValueOrZero(String value) {
        return value.equals("Math") || value.equals("Verbal") ? 0 : Integer.parseInt(value);
    }

}