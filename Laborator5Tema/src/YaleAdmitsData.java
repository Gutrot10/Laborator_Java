import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class YaleAdmitsData implements Comparable<YaleAdmitsData> {
     private int yearEntered;
    private int applications;
    private int admits;
    private double admitRate;
    private int matriculare;
    private double yield;

    private int verbalScore;
   private int verbal10th;
   private int verbal25th;
   private int verbal50th;
   private int verbal75th;
   private int verbal90th;
   private int mathScore;
   private int math10th;
   private int math25th;
   private int math50th;
   private int math75th;
   private int math90th;
   private int SAT10;
   private int SAT25;
   private int SAT50;
   private int SAT75;
   private int SAT90;
   private int LegacyCount;
   private int NewHaven;
   private int NewYorkState;
   private int  NewEngland;
   private int EOM;
   private int WOM;
   private int US;
   private int total;


    public YaleAdmitsData(int yearEntered, int applications, int admits, double admitRate, int matriculare, double yield,int verbalScore, int verbal10th, int verbal25th, int verbal50th,int verbal75th, int verbal90th,int mathScore, int math10th, int math25th,int math50th, int math75th, int math90th, int SAT10, int SAT25, int SAT50, int SAT75, int SAT90, int legacyCount, int newHaven, int newYorkState, int newEngland, int EOM, int WOM, int US, int total) {
        this.yearEntered = yearEntered;
        this.applications = applications;
        this.admits = admits;
        this.admitRate = admitRate;
        this.matriculare = matriculare;
        this.yield = yield;
        this.verbalScore = verbalScore;
        this.verbal10th = verbal10th;
        this.verbal25th = verbal25th;
        this.verbal50th = verbal50th;
        this.verbal75th = verbal75th;
        this.verbal90th = verbal90th;
        this.mathScore = mathScore;
        this.math10th = math10th;
        this.math25th = math25th;
        this.math50th = math50th;
        this.math75th = math75th;
        this.math90th = math90th;
        this.SAT10 = SAT10;
        this.SAT25 = SAT25;
        this.SAT50 = SAT50;
        this.SAT75 = SAT75;
        this.SAT90 = SAT90;
        this.LegacyCount = legacyCount;
        this.NewHaven = newHaven;
        this.NewYorkState = newYorkState;
        this.NewEngland = newEngland;
        this.EOM = EOM;
        this.WOM = WOM;
        this.US = US;
        this.total = total;
    }


    public int getVerbalScore() {
        return verbalScore;
    }

    public void setVerbalScore(int verbalScore) {
        this.verbalScore = verbalScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getYearEntered() {
        return yearEntered;
    }

    public void setYearEntered(int yearEntered) {
        this.yearEntered = yearEntered;
    }

    public int getApplications() {
        return applications;
    }

    public void setApplications(int applications) {
        this.applications = applications;
    }

    public int getAdmits() {
        return admits;
    }

    public void setAdmits(int admits) {
        this.admits = admits;
    }

    public double getAdmitRate() {
        return admitRate;
    }

    public void setAdmitRate(double admitRate) {
        this.admitRate = admitRate;
    }

    public int getMatriculare() {
        return matriculare;
    }

    public void setMatriculare(int matriculare) {
        this.matriculare = matriculare;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public int getVerbal10th() {
        return verbal10th;
    }

    public void setVerbal10th(int verbal10th) {
        this.verbal10th = verbal10th;
    }

    public int getVerbal25th() {
        return verbal25th;
    }

    public void setVerbal25th(int verbal25th) {
        this.verbal25th = verbal25th;
    }

    public int getVerbal50th() {
        return verbal50th;
    }

    public void setVerbal50th(int verbal50th) {
        this.verbal50th = verbal50th;
    }

    public int getVerbal90th() {
        return verbal90th;
    }

    public void setVerbal90th(int verbal90th) {
        this.verbal90th = verbal90th;
    }

    public int getMath10th() {
        return math10th;
    }

    public void setMath10th(int math10th) {
        this.math10th = math10th;
    }

    public int getMath25th() {
        return math25th;
    }

    public void setMath25th(int math25th) {
        this.math25th = math25th;
    }

    public int getMath75th() {
        return math75th;
    }

    public void setMath75th(int math75th) {
        this.math75th = math75th;
    }

    public int getMath90th() {
        return math90th;
    }

    public void setMath90th(int math90th) {
        this.math90th = math90th;
    }

    public int getSAT10() {
        return SAT10;
    }

    public void setSAT10(int SAT10) {
        this.SAT10 = SAT10;
    }

    public int getSAT25() {
        return SAT25;
    }

    public void setSAT25(int SAT25) {
        this.SAT25 = SAT25;
    }

    public int getSAT50() {
        return SAT50;
    }

    public void setSAT50(int SAT50) {
        this.SAT50 = SAT50;
    }

    public int getSAT75() {
        return SAT75;
    }

    public void setSAT75(int SAT75) {
        this.SAT75 = SAT75;
    }

    public int getSAT90() {
        return SAT90;
    }

    public void setSAT90(int SAT90) {
        this.SAT90 = SAT90;
    }

    public int getLegacyCount() {
        return LegacyCount;
    }

    public void setLegacyCount(int legacyCount) {
        LegacyCount = legacyCount;
    }

    public int getNewHaven() {
        return NewHaven;
    }

    public void setNewHaven(int newHaven) {
        NewHaven = newHaven;
    }

    public int getNewYorkState() {
        return NewYorkState;
    }

    public void setNewYorkState(int newYorkState) {
        NewYorkState = newYorkState;
    }

    public int getNewEngland() {
        return NewEngland;
    }

    public void setNewEngland(int newEngland) {
        NewEngland = newEngland;
    }

    public int getEOM() {
        return EOM;
    }

    public void setEOM(int EOM) {
        this.EOM = EOM;
    }

    public int getWOM() {
        return WOM;
    }

    public void setWOM(int WOM) {
        this.WOM = WOM;
    }

    public int getUS() {
        return US;
    }

    public void setUS(int US) {
        this.US = US;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int compareTo(YaleAdmitsData o){
        return Double.compare(this.admitRate,o.admitRate);
    }

    @Override
    public String toString() {
        return "YaleAdmitsData{" +
                "yearEntered=" + yearEntered +
                ", applications=" + applications +
                ", admits=" + admits +
                ", admitRate=" + admitRate +
                ", matriculare=" + matriculare +
                ", yield=" + yield +
                ", verbalScore=" + verbalScore +
                ", verbal10th=" + verbal10th +
                ", verbal25th=" + verbal25th +
                ", verbal50th=" + verbal50th +
                ", verbal75th=" + verbal75th +
                ", verbal90th=" + verbal90th +
                ", mathScore=" + mathScore +
                ", math10th=" + math10th +
                ", math25th=" + math25th +
                ", math50th=" + math50th +
                ", math75th=" + math75th +
                ", math90th=" + math90th +
                ", sat10=" + SAT10 +
                ", sat25=" + SAT25 +
                ", sat50=" + SAT50 +
                ", sat75=" + SAT75 +
                ", sat90=" + SAT90 +
                ", legacyCount=" + LegacyCount +
                ", newHaven=" + NewHaven +
                ", newEngland=" + NewEngland +
                ", newYorkState=" + NewYorkState +
                ", eastOfMississippi=" + EOM +
                ", westOfMississippi=" + WOM +
                ", usPossForeign=" + US +
                ", total=" + total +
                '}';
    }
}

