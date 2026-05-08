package enumTest;

public class time {
    private Week week;
    private int hour;
    private int minute;
    private int second;
    public time(Week week, int hour, int minute, int second){
        this.week = week;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public time(){}

    public String getTime(){
        return week.getDay() + " " + hour + ":" + minute + ":" + second;
    }
}
