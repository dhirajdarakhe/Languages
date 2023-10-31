public class commandLine {
    public static void main(String[] args) {
        double o = 0;
        for(String s : args){
            // System.out.println(s);
            o = o + Double.parseDouble(s);
        }System.out.println(o);
    }
}
