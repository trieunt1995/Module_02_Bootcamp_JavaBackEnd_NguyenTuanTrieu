package com.trieunt;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();

    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.setStartTime(new Date());
    }
    public void end() {
        this.setEndTime(new Date());
    }

    public long getElapsedTime() {
        return getEndTime().getTime() - getStartTime().getTime();
    }


}
