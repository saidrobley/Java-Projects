import java.util.HashMap;


public class WordScore {
    private static HashMap<Character, Integer> hashMap;
    public static void main(String[] args){

        // F = 3, J = 6, X = 12, A, I, E, O = 2, T = 5, all others = 0
        //String str = "XRay Machine";
        String str = "Jabbt";
        str = str.toUpperCase();
        hashMap = new HashMap<Character, Integer>();
        hashMap.put('F', 3);
        hashMap.put('J', 6);
        hashMap.put('X', 12);
        hashMap.put('A', 2);
        hashMap.put('I', 2);
        hashMap.put('E', 2);
        hashMap.put('O', 2);
        hashMap.put('T', 5);
       // System.out.println(hashMap.get("F"));

        int result = getScore(str);
        System.out.println("result = " + result);
    }

    private static int getScore(String str){
        int score = 0;
        for(int i = 0; i < str.length(); i++){
            if(hashMap.containsKey(str.charAt(i))){
                score += hashMap.get(str.charAt(i));
            }
        }
        return score;
    }
}
