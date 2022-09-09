package HeadFirstJavaChapterOne;

public class Clock {

    private int hour;
    private int minutes;
    private int second;


    public Clock() {

    }

    public Clock(int hour, int minutes, int second) {

        this.hour = hour;
        this.minutes = minutes;
        this.second = second;

    }

    public void setHour(int hour) {

        if (hour > 23) {

            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        if(minutes > 59){
            this.minutes = minutes;
        }
    }

    public int getMinutes() {

        return minutes;
    }

    public void setSecond(int second) {
        if(second > 59){
            this.second = second;
        }
    }

    public int getSecond() {
        return second;
    }

    public void displayTime(){

        System.out.print("Hours" + ":" + "Minutes" + ":" + "Second");
    }

}