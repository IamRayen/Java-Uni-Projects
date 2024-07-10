import algorithmen.Algorithmen;

public class main{
    
    public static void main(String[] args){
        /*
         * Ab hier soll die main-Methode implementiert werden.
         * Methoden aus Algorithmen.java können mit Algorithmen.Methodennamen(...) aufgerufen werden.
         */
        int[] unsortedArray = {3,2,1,8,9,10, 4, 5, 6, 7,50,20,5000,411};

        Algorithmen.binarySearch(unsortedArray,5000);
        Algorithmen.binarySearch(unsortedArray,612);
    }
        

}
