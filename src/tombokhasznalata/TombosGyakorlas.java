package tombokhasznalata;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class TombosGyakorlas {
    /*
            TÖMBÖK létrehozása
            ha tudjuk az értékeket
    */
    String[] nev  = {"Alex", "Mihály", "Marcell", "Ádám"};
    int[] kor = {22, 31, 19, 27};
    
    /*
            ha NEM tudjuk az értékeket
    */
    
    final int TOMB_MERET = 4;
    
    String[] nevek;
    int[] korok;
    
    nevek = new String[TOMB_MERET];
    nevek[0] = "Alex";
    nevek[1] = "Mihály";
    nevek[2] = "Marcell";
    nevek[3] = "Ádám";
    
    korok = new int[TOMB_MERET];
    korok[0] = 22;
    korok[1] = 31;
    korok[2] = 19;
    korok[3] = 27; 
}
