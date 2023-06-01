package API.date.JDK7Date;

public class DateWrite {
    private long time;
    public DateWrite(){
        this.time=System.currentTimeMillis();
    }
    public DateWrite(long time){
        this.time=time;
    }

    public long getTime(){
        return time;
    }

    public void setTime(long time){
        this.time=time;
    }
}
