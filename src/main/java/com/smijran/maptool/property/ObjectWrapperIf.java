package com.smijran.maptool.property;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public interface ObjectWrapperIf
{
    < T > PropertyWrapperIf< T > property( String ... aPath );

    < T > PropertyWrapperIf< T > property( PropertyIf< T > aProperty );

    < T > PropertyWrapperIf< T > path( PropertyIf< T > aProperty, PropertyIf< ObjectWrapperIf > ... aPath );
}
