//

public class SnackAutomat {
    /*public int køb(int varePris, int betalt){
        int byttePenge = betalt - varePris;
        return byttePenge;
         if(varePris <0||betalt<0){

     }
    }*/

    public int køb(int varePris, int betalt) {
        int byttePenge = betalt - varePris;

        if (varePris < 0 || betalt < 0) {
            throw new IllegalArgumentException("du mangler at betale det udsående beløb");
        }
        if (betalt < varePris) {
            throw new IllegalArgumentException("Det betalte beløb er for lille i forhold til prisen.");
        }
        return byttePenge;

    }
}
