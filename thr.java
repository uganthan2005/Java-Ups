public class thr {
    public static void main(String[] args) {
        thr out = new thr();
        test t = out.new test();
        try {
            t.check(15);
        } catch (exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
    class exception extends Exception{
        public exception(String message){
            super(message);
        }
}
class test{
    public void check(int a) throws exception{
        if(a<18){
            throw new exception("Age is less than 18");
        }
        else{
            System.out.println("Age is valid");
        }
    }
}
}
