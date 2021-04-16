public class sept9
{
    public static void main(String[] args)
    {
        int x, y;
        x = 8;
        y = 9;

        System.out.println(x + y + " stinks ");
        // Printed: 17 stinks
        // Note that 8 and 9 are added. 

        System.out.println("smells " + x + y);
        // Printed: smells 89
        // Note that 8 and 9 are not added
        // Since the first thing is print, it stays in print mode the whole time
        // That is why 8 and 9 are printed and not added
        // Important concept to know on the AP exam

        System.out.println( x + y + " reeks " + x + y);
        // Printed: 17 reeks 89
        // At the beginning it isn't in preint mode so 8 and 9 are added
        // When it prints "reeks" its in print mode and so 8 and 9 aren't added but printed instead. 
    }
}