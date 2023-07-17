package controller;

public class SearchItemBySubString {
    public boolean searchItemSubString(String text, String word){
        int lText = text.length();
        int lWord = word.length();
        if (lText >= lWord) {
            for (int i = 0; i <= lText - lWord; i++) {
                String subWord = text.substring(i, lWord + i);
                if (subWord.equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}
