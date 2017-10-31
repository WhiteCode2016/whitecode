package com.whitecode.quartz.enums;

/**
 * 任务的状态
 * Created by White on 2017/10/18.
 */
public enum QuartzEnum {
    /** 正常 */
    NORMAL,
    /** 暂停 */
    PAUSE,
    /** 禁用 */
    DISABLED,
    /** 异步 */
    ASYNC,
    /** 同步 */
    SYNC;
}