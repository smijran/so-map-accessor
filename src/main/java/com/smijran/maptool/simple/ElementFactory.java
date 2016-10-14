package com.smijran.maptool.simple;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by kszalkowski on 2016-10-14.
 */
public final class ElementFactory
{

    public static < T > AttributeIf< T > attribute( String name, Class< T > type )
    {
        return new Attribute< T >( name, type );
    }

    public static InternalMapIf internalMap( String name )
    {
        return new InternalMap( name );
    }

    public static < E extends ElementIf< T >, T > ElementPathIf< E, T > path( E aFinal,
        Collection< InternalMapIf > aPredecessors )
    {
        return new ElementPath<>( aPredecessors, aFinal );
    }

    public static < E extends ElementIf< T >, T > ElementPathIf< E, T > path( E aFinal,
        InternalMapIf ... aPredecessors )
    {
        return path( aFinal, Arrays.asList( aPredecessors ) );
    }

    private static class Element< T > implements ElementIf< T >
    {
        private final String name;

        private Element( String name )
        {
            this.name = name;
        }

        @Override
        public String name()
        {
            return name;
        }

        @Override
        public boolean equals( Object o )
        {
            if( this == o )
                return true;
            if( o == null || getClass() != o.getClass() )
                return false;

            Element element = (Element)o;

            return name.equals( element.name );

        }

        @Override
        public int hashCode()
        {
            return name.hashCode();
        }

        @Override
        public String toString()
        {
            return "Element{" +
                "name='" + name + '\'' +
                '}';
        }
    }

    private final static class InternalMap extends Element< MapWrapperIf > implements InternalMapIf
    {

        private InternalMap( String name )
        {
            super( name );
        }

        @Override
        public String toString()
        {
            return "InternalMap{" +
                "name='" + name() + '\'' +
                '}';
        }
    }

    private final static class Attribute< T >extends Element< T > implements AttributeIf< T >
    {
        private final Class< T > type;

        private Attribute( String name, Class< T > type )
        {
            super( name );
            this.type = type;
        }

        @Override
        public Class< T > type()
        {
            return type;
        }

        @Override
        public boolean equals( Object o )
        {
            if( this == o )
                return true;
            if( o == null || getClass() != o.getClass() )
                return false;
            if( !super.equals( o ) )
                return false;

            Attribute< ? > attribute = (Attribute< ? >)o;

            return type.equals( attribute.type );

        }

        @Override
        public int hashCode()
        {
            int result = super.hashCode();
            result = 31 * result + type.hashCode();
            return result;
        }

        @Override
        public String toString()
        {
            return "Attribute{" +
                "name='" + name() + '\'' +
                "type=" + type +
                '}';
        }
    }

    private final static class ElementPath< E extends ElementIf< T >, T > implements ElementPathIf< E, T >
    {
        private ElementPath( Collection< InternalMapIf > aPredecessors, E aFinal )
        {

        }

        @Override
        public List< InternalMapIf > path()
        {
            return null;
        }

        @Override
        public E element()
        {
            return null;
        }
    }
}
