package pl.sda.zajecia4.task2.Cw2_interfejsy2;

public enum Color {
    RED(1),
    WHITE(2),
    BLACK(3);

    private int number;

    Color(int number) { //private
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public static Color getColor(int number){
        for(Color c: Color.values()){
            if(c.number == number)
                return c;
        }
        return WHITE;
    }

}
