package com.smijran.maptool.simple;

import java.util.Map;
import java.util.Optional;

/**
 * Created by kszalkowski on 2016-10-14.
 */
final class MapWrapper implements MapWrapperIf
{
    private final Map< String, Object > map;

    MapWrapper( Map< String, Object > map )
    {
        if( map == null )
        {
            throw new NullPointerException( "Map is null." );
        }
        this.map = map;
    }

    @Override
    public < T > Optional< T > get( String ... aPath )
    {
        return Optional.empty();
    }

    @Override
    public < T > Optional< T > get( Class< T > aType, String ... aPath )
    {
        return Optional.empty();
    }

    @Override
    public Optional< MapWrapperIf > get( InternalMapIf aInternal )
    {
        return Optional.empty();
    }

    @Override
    public < T > Optional< T > get( AttributeIf< T > aAttribute )
    {
        return Optional.empty();
    }
}
