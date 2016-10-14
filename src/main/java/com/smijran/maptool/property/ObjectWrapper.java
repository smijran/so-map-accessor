package com.smijran.maptool.property;

import java.util.Map;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public class ObjectWrapper implements ObjectWrapperIf {
    public ObjectWrapper(Map<String, Object> aMap) {
    }

    @Override
    public <T> PropertyWrapperIf<T> property(String... aPath) {
        return null;
    }
}
