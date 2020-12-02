package generators;

public class TestFields {
    public String story = "";
    public String title = "";
    public String result = "";
    public String date = "";
    public String stability = "";
    public String duration = "";
    public String defect = " ";
    public String failureReason = " ";

    public TestFields(String story, String title, String result, String date, String stability, String duration, String failureReason, String defect) {
        this.story = story;
        this.title = title;
        this.result = result;
        this.date = date;
        this.stability = stability;
        this.duration = duration;
        this.defect = defect;
        this.failureReason = failureReason;
    }

    public String getStory() {
        return story;
    }

    public String getTitle() {
        return title;
    }

    public String getResult() {
        return result;
    }

    public String getDate() {
        return date;
    }

    public String getStability() {
        return stability;
    }

    public String getDuration() {
        return duration;
    }

    public String getDefect() {
        return defect;
    }

    public String getFailureReason() {
        return failureReason;
    }

    @Override
    public String toString() {
        return "ReportUtil{" +
                "story='" + story + '\'' +
                ", title='" + title + '\'' +
                ", result='" + result + '\'' +
                ", date='" + date + '\'' +
                ", stability='" + stability + '\'' +
                ", duration='" + duration + '\'' +
                ", defect='" + defect + '\'' +
                ", failureReason='" + failureReason + '\'' +
                '}';
    }
}


