/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author RArora
 */
public class UnoCard 
    { 
        enum Colour 
            {   
                Red, Blue, Green, Yellow, Wild;
                
                private static final Colour [] colours = Colour.values();
                public static Colour getColour(int i)   
                    {
                        return Colour.colours[i];
                    }
            }
        
        enum Value 
            {   
                Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip, Reverse, Wild, Wild_Four  ;
                
                private static final Value [] values = Value.values();
                public static Value getValue (int i)
                    {
                        return Value.values[i];
                    }
            }
        private final Colour colour;
        private final Value value;
        
        public UnoCard(final Colour colour, final Value value)
            {
                this.colour = colour;
                this.value = value;
            }
        
        public Colour getColour()
            {
                return this.colour;
            }
        
        public Value getValue()
            {
                return this.value; 
            }
        
        public String toString()
            {
                return colour + "_" + value;
            }
}
