public class PlayerCharacter {
    static int x = 0;
    static int y = 0;

    public static int getX(){
        return x;

    }

    public static int getY(){
        return y;
    }

    public static void move(char direction){
        if (direction == 'w') {
            y += 1;
        }
    }
}



