package code;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

/**
 @author Altamash M Fakki
 @version 2.0
 */
/** Sort class is an Abstract class*/
public abstract class Sort
{
    private String name;
    private String description;
    private long totalSortTime;
    private long startTime;
    private long endTime;
    private int rank;
    Date date = new Date();
    public Sort (String name, String description,long endTime, long totalSortTime, int rank)
    {
        this.name = name;
        this.description = description;
        this.startTime = date.getTime();
        this.endTime = endTime;
        this.totalSortTime = totalSortTime;
        this.rank = rank;
    }
    
    public abstract void algorithm();
    
    public String getName(){
        return name;
    }
    
    public long getStartTime(){
        return startTime;
    }
    
    public long getEndTime(){
        return endTime;
    }
    
    public String getDescription(){
        return description;
    }
    
    public long getTotalSortTime(){
        return totalSortTime;
    }

    public int getRank(){
        return rank;
    }
    
}
