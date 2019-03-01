public class Word {


    public String word;
    public String meaning;



    public Word(String input_word, String input_meaning) {
        word = input_word;
        meaning = input_meaning;

    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }


    public int getWords() {
        return ( word + meaning );
    }





}
