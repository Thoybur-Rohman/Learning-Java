public class Main {

    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);
       System.out.println(listy.getUsingMod(4));
       System.out.println(listy.getUsingMod(5));
       System.out.println(listy.getUsingMod(6));
    }
}
