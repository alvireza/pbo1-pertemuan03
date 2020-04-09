package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDidompet = 53000;

        if(uangDidompet<totalBelanja) {

            System.out.println("Uang Kurang, Kurangi Jajan Anda");
        }else{
            System.out.println("Uang Cukup, Beralaan Lahh");
        }
    }
}
