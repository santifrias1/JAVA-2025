public class Clock {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s) {
        hour = (h >= 0 && h < 24) ? h : 0;
        minute = (m >= 0 && m < 60) ? m : 0;
        second = (s >= 0 && s < 60) ? s : 0;
    }

    public void showTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    public void advanceSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }
}
