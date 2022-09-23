package com.oltpbenchmark.benchmarks.featurebench.BindingFunctions;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public abstract class TimeUtil {

    public final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    public final static SimpleDateFormat DATE_FORMAT_14 = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     * TODO(djellel)
     *
     * @return
     */
    public static String getCurrentTimeString14() {
        return com.oltpbenchmark.benchmarks.featurebench.BindingFunctions.TimeUtil.DATE_FORMAT_14.format(new java.util.Date());
    }

    /**
     * TODO(djellel)
     *
     * @return
     */
    public static String getCurrentTimeString() {
        return com.oltpbenchmark.benchmarks.featurebench.BindingFunctions.TimeUtil.DATE_FORMAT.format(new java.util.Date());
    }

    /**
     * Get a timestamp of the current time
     */
    public static Timestamp getCurrentTime() {
        return new Timestamp(System.currentTimeMillis());
    }
}
