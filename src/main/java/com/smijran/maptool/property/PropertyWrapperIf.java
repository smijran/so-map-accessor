package com.smijran.maptool.property;

import java.util.function.Consumer;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public interface PropertyWrapperIf< T >
{
    boolean isSet();

    T get();

    void set( T aValue );


    /**
     * If a value is set, invoke the specified consumer with the value,
     * otherwise do nothing.
     *
     * @param consumer block to be executed if a value is present
     * @throws NullPointerException if value is present and {@code consumer} is
     * null
     */
    default void ifSet(Consumer<? super T> consumer) {
        if (this.isSet())
            consumer.accept(this.get());
    }
}
