package com.smijran.maptool.property;

import java.util.Map;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public class SM
{
    public static ObjectWrapperIf of( Map< String, Object > aMap )
    {
        return new ObjectWrapper( aMap );
    }
}
