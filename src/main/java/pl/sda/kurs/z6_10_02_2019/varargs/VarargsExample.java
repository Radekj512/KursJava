package pl.sda.kurs.z6_10_02_2019.varargs;

public class VarargsExample {

    public void fun(int a){
        System.out.println(a);
    }
    public void fun(int a, int b){
        System.out.println(a + " " +b);
    }
    public void fun(int... a){
       // a.length; -- sprawdzenie ilosci argumentow
        for (int i : a){
            System.out.print(i+", ");
        }
    }
    public void fun(String a, int... b){} //varargs musi byc ostatnim argumentem
}
