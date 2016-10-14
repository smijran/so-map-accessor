package com.smijran.maptool.property;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public interface PropertyIf<T> {
    String name();
    Class<T> type();
}
