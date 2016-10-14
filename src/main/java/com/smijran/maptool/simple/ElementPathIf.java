package com.smijran.maptool.simple;

import java.util.List;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public interface ElementPathIf< E extends ElementIf< T >, T >
{
    List< InternalMapIf > path();

    E element();
}
