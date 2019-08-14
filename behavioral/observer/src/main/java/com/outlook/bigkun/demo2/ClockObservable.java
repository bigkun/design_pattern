package com.outlook.bigkun.demo2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

/**
 * @author zhanghk
 * @since 2019/8/14
 */
public class ClockObservable extends Observable {

    public void updateTime() {
        setChanged();
    }
    public String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}
