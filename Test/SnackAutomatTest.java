import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnackAutomatTest {

    @Test
    public void køb() {

    //------------Arrange-------------------
        SnackAutomat automat = new SnackAutomat();
        int varePris = 50;
        int betalt = 100;
        int byttePenge = 50;
    //-----------Act------------
    int actual = automat.køb(varePris,betalt);

    //---------Assert-------------
        assertEquals(byttePenge,actual);
    }
}