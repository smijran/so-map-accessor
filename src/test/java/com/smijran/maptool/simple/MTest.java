package com.smijran.maptool.simple;

import com.smijran.maptool.simple.ElementFactory;
import com.smijran.maptool.simple.M;
import com.smijran.maptool.simple.MapWrapperIf;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public class MTest
{

    @Test
    public void testEmptyMap1() throws Exception
    {
        final Map< String, Object > map = new HashMap<>();

        final Optional< Object > optional = M.of( map ).get( "a" );

        assertThat( optional ).isEmpty();
    }

    @Test
    public void testEmptyMap2() throws Exception
    {
        final Map< String, Object > map = new HashMap<>();

        final Optional< String > optional = M.of( map ).get( String.class, "a" );

        assertThat( optional ).isEmpty();
    }

    @Test
    public void testEmptyMap3() throws Exception
    {
        final Map< String, Object > map = new HashMap<>();

        final Optional< String > optional =
            M.of( map ).get( ElementFactory.attribute( "a", String.class ) );

        assertThat( optional ).isEmpty();
    }

    @Test
    public void testEmptyMap4() throws Exception
    {
        final Map< String, Object > map = new HashMap<>();

        final Optional<MapWrapperIf> optional =
                M.of( map ).get( ElementFactory.internalMap( "a") );

        assertThat( optional ).isEmpty();
    }
}