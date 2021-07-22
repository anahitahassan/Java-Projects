
public class catObject
{
    // attributes
    private int age;
    private String color;
    private String size;
    
    /* Rules for creating Java constructor
    *    1. Constructor name must be the same as its class name
    *    2. A Constructor must have no explicit return type
    *    3. A Java constructor cannot be abstract, static, final, and synchronized
    *  Types of Java constructors
    *    - Default constructor (no-arg constructor)
    *    - Parameterized constructor
    */

    public catObject()
    {
        age = 2;
        color = "white";
        size = "fat";
    }
    
    // custom instructor
    public catObject(int a, String c, String s)
    {
        age = a;
        color = c;
        size = s;
    }
    
    // getters
    public int getAge()
    {
        return age;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getSize()
    {
        return size;
    }
    
    // setters (reset)
    public void setAge( int a )
    {
        age = a;
    }
    
    public void setColor( String c )
    {
        color = c;
    }
    
    public void setSize( String s )
    {
        size = s;
    }
    
}