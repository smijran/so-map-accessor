package com.smijran.maptool.simple;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public interface AttributeIf< T >extends ElementIf< T >
{
    Class< T > type();
}
