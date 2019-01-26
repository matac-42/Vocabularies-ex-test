import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VocaEx {

    private List<String[]> list = new ArrayList<>();
    private String[][] wordSet;


    public void splitSet(String words){
        try{
            Scanner scanner = new Scanner(new File(words));
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
