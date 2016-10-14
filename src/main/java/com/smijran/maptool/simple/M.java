package com.smijran.maptool.simple;

import java.util.Map;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public final class M
{
    public static MapWrapperIf of(Map<String,Object> aMap){
        return new MapWrapper(aMap);
    }

}
