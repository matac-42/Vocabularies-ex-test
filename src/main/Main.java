public class Main {
    public static void main(String[] args){

        String wordsFileName = "/Users/e185742/prog2/Vocabularies_exercise/doc/wordset2";

        VocaEx vocaEx = new VocaEx();
        vocaEx.splitSet(wordsFileName);
        vocaEx.quiz();
    }
}
