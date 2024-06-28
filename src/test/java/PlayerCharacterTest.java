import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    public void getXTest_return0() {
        //GIVEN
        PlayerCharacter.x = 0;

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(0, actual);

    }

    @Test
    public void getYTest_return0() {
        //GIVEN
        PlayerCharacter.y = 0;

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(0, actual);
    }

    @Test
    public void moveTest_whenW_thenYEquals1() {
        //GIVEN
        char dir = 'w';
        PlayerCharacter.y = 0;

        //WHEN
        PlayerCharacter.move(dir);
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(1, actual);
    }

    @Test
    public void moveTest_whenS_thenYEqualsNegative1() {
        //GIVEN
        char dir = 's';
        PlayerCharacter.y = 0;

        //WHEN
        PlayerCharacter.move(dir);
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(-1, actual);
    }

    @Test
    public void moveTest_whenA_thenXEqualsNegative1() {
        //GIVEN
        char dir = 'a';
        PlayerCharacter.x = 0;

        //WHEN
        PlayerCharacter.move(dir);
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(-1, actual);
    }

    @Test
    public void moveTest_whenD_thenXEquals1() {
        //GIVEN
        char dir = 'd';
        PlayerCharacter.x = 0;

        //WHEN
        PlayerCharacter.move(dir);
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(1, actual);
    }
}
