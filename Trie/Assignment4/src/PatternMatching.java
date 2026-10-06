import java.util.ArrayList;

class TrieNode{
    char data;
    TrieNode children[];
    boolean isTerminating;
    int childCount;

    public TrieNode(char data){
        this.data=data;
        children=new TrieNode[26];
        isTerminating=false;
        childCount=0;
    }
}

class Trie {
    private TrieNode root;
    private int countWord;

    public Trie(){
        root=new TrieNode('\0');
        countWord=0;
    }

    public void add(String word){
        add(root,word);
    }

    private void add(TrieNode root, String word) {
        if(word.length()==0){
            if(root.isTerminating==false){
                root.isTerminating=true;
                countWord++;
            }
            return;
        }

        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];

        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childCount++;
        }
        add(child,word.substring(1));
    }

    public boolean search(String word){
        return search(root,word);
    }

    private boolean search(TrieNode root, String word) {
        if(word.length()==0){
            return true;
        }

        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];

        if(child==null){
            return false;
        }
        return search(child,word.substring(1));
    }


    public int CountWord(){
        return countWord;
    }


}
public class PatternMatching {

    public static boolean patternMatching(ArrayList<String> input,String pattern){
        for(int i=0;i<input.size();i++){
            Trie trie=new Trie();
            String string=input.get(i);
            for(int j=0;j<string.length();j++){
                trie.add(string.substring(j));
            }
            if(trie.search(pattern)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("abc");
        a.add("def");
        a.add("ghi");
        a.add("cba");
        System.out.println(patternMatching(a,"hi"));
    }
}
