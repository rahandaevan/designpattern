public class Helper {

    private static Tester tester;

    public static Tester getConnection(){
        if (tester==null){
            tester = new Tester();
        }
        return tester;
    }
}
