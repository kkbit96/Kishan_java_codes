public class PatternSearching {
    public static void patternSearch(String txt, String pat){
        int pos = txt.indexOf(pat);
        while(pos>=0){
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos+1);
        }
    }

    public static void main(String[] args) {
        String txt = "geeks for geeks";
        String pat = "geeks";
        patternSearch(txt, pat);
    }
}
