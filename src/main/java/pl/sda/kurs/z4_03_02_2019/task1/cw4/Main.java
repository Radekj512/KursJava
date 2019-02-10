package pl.sda.zajecia4.task1.cw4;

public class Main {
    public static void main(String[] args) {
        Phone tel = new Phone(6,2,true);
        Handheld tablet = new Handheld(10,1);
        Handheld handPhone = new Phone(6,2,true);

        Handheld[] tab = {tablet, handPhone};
        for(Handheld t:tab){
            t.ring();
            t.turnoff();
        }
        System.out.println(handPhone.equals(tel));
    }
}
