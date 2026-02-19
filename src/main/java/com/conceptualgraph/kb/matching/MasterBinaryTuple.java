package com.conceptualgraph.kb.matching;

import com.conceptualgraph.kb.BinaryTuple;

/**
    A tuple for a master graph that contains additional information about how it's been matched.
 */
public class MasterBinaryTuple extends BinaryTuple
{
    public boolean tupleUsed = false;
    
    public float score1 = 1;
    public float score2 = 1;
    
    public MasterBinaryTuple()
    {
    
    }
    
   public MasterBinaryTuple(com.conceptualgraph.charger.obj.Concept c1, com.conceptualgraph.charger.obj.Relation r, com.conceptualgraph.charger.obj.Concept c2 )
   {   
        super( c1, r, c2 ); 
        com.conceptualgraph.charger.Global.info( "Master tuple constructor: " + concept1_label + " " + relation_label + " " + concept2_label );
   }
    
    /**
        Returns the total score possible in matching this tuple.
     */
    public float getTotalScore()  { return score1 + score2; }


    /**
        Creates HTML code suitable for including in an HTML table row. TABLE and TR tags must be generated elsewhere.
     */
    public String toHTML()
    {
        String html = "";
        html += super.toHTML();
            html += " <TD width=60>&nbsp;\n";
            html += " <TD width=60>&nbsp;\n";
            html += " <TD width=80>&nbsp;\n";
            html += " <TD width=60>&nbsp;\n";
        
        return html;
    }
    
    
}