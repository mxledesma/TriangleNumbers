package StaticExplained;


/*
Static Blocks
Static code blocks are used to initialise static variables.
These blocks are executed immediately after declaration of static variables.
 */
public class Saturn {

    public static final int MOON_COUNT;  // once when it is declared final you cannot change it.
    public int MOON_COUNT2;
    static {
        MOON_COUNT = 62;  // you can only place static values inside static block
       /* MOON_COUNT2 = 55;   */ // This does not work b/c MOON_COUNT2 is NOT STATIC
    }

    public class moon{
      //MOON_COUNT2= 4;    */ // wont work
        int MOON_COUNT = 7;
    }


}
