public class TrieUse {
    public static void main(String[] args) {
        Trie t=new Trie();
        t.add("news");
        t.add("toy");
        t.add("photo");
        System.out.println(t.search("toy"));
        t.remove("toy");
        System.out.println(t.search("toy"));
    }
}
