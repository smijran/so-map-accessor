package com.smijran.maptool.property;

import com.smijran.maptool.simple.M;
import com.sun.deploy.security.ruleset.ExceptionRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.*;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public class SMTest
{
    @Rule
    ExpectedException exception = ExpectedException.none();

    @Test
    public void testEmptyMap1() throws Exception
    {
        final Map< String, Object > map = new HashMap<>();

        final boolean set = SM.of( map ).property( "a" ).isSet();

        assertThat( set ).isFalse();
    }

    @Test
    public void testEmptyMap2() throws Exception
    {
        final Map< String, Object > map = new HashMap<>();

        SM.of( map ).property( "a" ).get();

        exception.expect( NoSuchElementException.class );
    }

}