package dtu.projectmanagement.domain;
import dtu.projectmanagement.domain.Project;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private int activityNum;
    String activityName;
    int startWeek;
    int endWeek;
    double expectedWorkHours;
    private List<String> assignedEmployees = new ArrayList<>();

    public Activity(int activityNum, String activityName) {
        this.activityName = activityName;
        this.activityNum = activityNum;

    }

    public void assignEmployee(String employee){
        assignedEmployees.add(employee);
    }

    public String getActivityName() {
        return activityName;
    }

    public int getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(int startWeek) {
        this.startWeek = startWeek;
    }

    public int getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(int endWeek) {
        this.endWeek = endWeek;
    }

}
