package com.smijran.maptool.simple;

import java.util.Optional;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public interface MapWrapperIf
{
    < T > Optional< T > get( String ... aPath );

    < T > Optional< T > get( Class< T > aType, String ... aPath );

    < T > Optional< T > get( ElementIf< T > aAttribute );

    < E extends ElementIf< T >, T > Optional< T > get( ElementPathIf< E, T > aPath );
}
