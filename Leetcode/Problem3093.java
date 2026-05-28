class Problem3093 {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];

        // store best index
        int index = -1;

        // store shortest length
        int len = Integer.MAX_VALUE;
    }

    TrieNode root = new TrieNode();

    // insert reversed word
    void insert(String word, int idx) {
        TrieNode node = root;

        // update root info
        if (word.length() < node.len) {
            node.len = word.length();
            node.index = idx;
        }

        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            int pos = ch - 'a';

            if (node.child[pos] == null) {
                node.child[pos] = new TrieNode();
            }

            node = node.child[pos];

            // keep shortest length word
            if (word.length() < node.len) {
                node.len = word.length();
                node.index = idx;
            }
        }
    }

    // search best match
    int search(String word) {
        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            int pos = ch - 'a';

            if (node.child[pos] == null) {
                break;
            }

            node = node.child[pos];
        }

        return node.index;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        // build trie
        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        // process queries
        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }
}