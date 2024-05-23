package week2;

public class Midterm {
    public static void main(String[] args) {
        MidtermUtil util = new MidtermUtil();
        util.myQ(10);
        util.myMod(7, 3);
        util.myDiv(10, 5);
        System.out.println(util.myMessage("world" + "!"));
        System.out.println(MidtermUtil.getE());
        Linear.getDayOfWeek(2);
    }
}
