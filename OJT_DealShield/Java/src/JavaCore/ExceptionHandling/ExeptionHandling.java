package JavaCore.ExceptionHandling;

public class ExeptionHandling {
    // print n(th) element of an array
    public static void print(int n, int[] a) throws Exception {
        try{
            System.out.println(a[n]);
        } catch (Exception e){
            System.out.println("Error, try again");
            throw new Exception("Hello, Im a custome exception"); // custom exception
        } finally {
            System.out.println("Im always be called no MATTER WHAT");
        }
    }
}
