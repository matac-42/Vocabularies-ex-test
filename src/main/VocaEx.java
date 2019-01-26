import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Vocabularies exercises for final exam.
 */

public class VocaEx {

    String wordsFileName = "/Users/e185742/prog2/Vocabularies_exercise/wordfile/set";
    private List<String[]> list = new ArrayList<>();
    private String[][] wordSet;

    public void selectWordSet(){

    }

    /**
     * Formatting wordSet for extend file.
     */
    public void splitSet(){
        try{
            Scanner scanner = new Scanner(new File(wordsFileName));
            scanner.useDelimiter("\n");
//            int counter = 0;
            while(scanner.hasNext()){
                String[] string = scanner.next().split(" ");
//                wordSet[counter] = string;
//                counter++;
                list.add(string);
            }
            wordSet = list.toArray(new String[list.size()][]);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }

    }

    /**
     * Output file name list, in the wordfile.
     */
    public void ListFiles(){
        File dir = new File("/Users/e185742/prog2/Vocabularies_exercise/wordfile/");
        String[] list = dir.list();
        System.out.println("[ファイル一覧]-------------------");
        for(String fileName : list){
            System.out.println(fileName.replace("/Users/e185742/prog2/Vocabularies_exercise/wordfile/",""));
        }
        System.out.println("-------------------------------");
    }

    /**
     * Represent the movement of the quiz.
     */
    public void quiz(){
        for(int i = 0; i< wordSet.length; i++){
            System.out.println(wordSet[i][0]+ " 何番？");
            Scanner scanner = new Scanner(System.in);
            String userIn = scanner.nextLine();
            if(userIn.equals(wordSet[i][2])){
                System.out.println("o (意味:"+wordSet[i][1]+")\n");
            }else{
                System.out.println("x\n");
                i--;
            }
        }
    }
}
