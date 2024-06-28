import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {

    @Test
    public void getXTest_return0() {
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getX();

        //THEN
        assertEquals(0, actual);

    }

    @Test
    public void getYTest_return0() {
        //GIVEN

        //WHEN
        int actual = PlayerCharacter.getY();

        //THEN
        assertEquals(0, actual);
    }

    @Test
    public void moveTest_whenW_thenYEquals1() {
        //GIVEN
        char dir = 'w';
        //WHEN
        PlayerCharacter.move(dir);
        //THEN
        assertEquals(1, PlayerCharacter.getY());
    }
}
