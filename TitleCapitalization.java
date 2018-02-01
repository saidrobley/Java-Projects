import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by saidrobley on 8/12/17.
 */
public class TitleCapitalization {
    private static List<String> wordsList;
    //private static ArrayList<String> wordsList;
    public static void main(String[] args){
        String title = "I LOVve solving problems and it is fun";
        String[] words = {"a", "the", "and", "for"};
        wordsList = Arrays.asList(words);
        String m = capitalize(title);
        System.out.println(m);

    }

    public static String capitalize(String str){
        if(str.isEmpty()){
            return "";
        }
        // lower case the title and spilit.
        String[] title = str.toLowerCase().split(" ");
        for(int j = 0; j < title.length; j++){
            if(j == 0 || j == str.length()-1 || !wordsList.contains(title[j])){
                title[j] = title[j].substring(0, 1).toUpperCase() + title[j].substring(1);
            }

        }
        String s = "";
        for(int i = 0; i<title.length; i++){
            s += title[i] + " ";
        }
        return s;


    }

}
