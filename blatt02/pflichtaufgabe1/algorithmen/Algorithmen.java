package algorithmen;

public class Algorithmen{  
    /* 
     * Überprüft, ob ein Array aufsteigend sortiert ist.
     */
    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length-1  ; ++i){
            if(arr[i]>arr[i+1]){
                return false;
            };
        };
        return true;
    }
    
    
    /* 
     * Diese Funktion sortiert ein gegebenes Array und nutzt Seiteneffekte aus.
     */
    public static int[] sort(int[] arr){
        for(int i = arr.length - 1; i > 0; --i){
            for(int j = 0; j < i; ++j){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                };
            };
        }
        return arr;
    }
    
    
    /* 
     * Diese Funktion überprüft mittels binärer Suche, ob das Array arr den Wert val enthält.
     * Darf nur sortierte Arrays erhalten.
     * Gibt nur zurück, ob val in arr enthalten ist.
     */
    public static boolean binarySearch(int[] arr, int val){
        int a = 0;
        int b = arr.length-1;

        if(!isSorted(arr)){
            sort(arr);
        };

        while(a != b){
            int m= (int) (a+b)/2;
            if(val <= arr[m]){
                b = m;
            }else{
                a = m+1;
            };
        };

        if(val == arr[a]){
            System.out.println("der Wert existiert");
            return true;
        }
        System.out.println("der Wert existiert nicht");
        return false;

    };
}