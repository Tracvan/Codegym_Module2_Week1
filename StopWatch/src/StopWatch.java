public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return endTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void start(){
        startTime= System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapseTime(){
        return endTime-startTime;
    }
}
