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

        if (direction == 's') {
            y -= 1;
        }

        if (direction == 'a') {
            x -= 1;
        }
        if (direction == 'd') {
            x += 1;
        }
    }
}



