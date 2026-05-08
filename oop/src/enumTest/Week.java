package enumTest;

public enum Week {
    MONDAY("周一"),
    TUESDAY("周二"),
    WEDNESDAY("周三"),
    THURSDAY("周四"),
    FRIDAY("周五"),
    SATURDAY("周六"),
    SUNDAY("周日");

    private final String name;
    Week(String name){
        this.name = name;
    }
    public String getDay(){
        return name;
    }
}
