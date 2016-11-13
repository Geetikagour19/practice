package com.test;

class TrieExample
{

	public static void main(String args[])
	{
		Trie t = new Trie();

		t.addWord("hello");
		t.addWord("hallo");
		t.addWord("hell");
		t.addWord("teg");
		t.addWord("tag");

		System.out.println("teg is present " + t.isWordPresent("teg"));
		System.out.println("tega is present " + t.isWordPresent("tega"));
	}
}

class TrieNode
{
	TrieNode child[];
	int count;

	TrieNode()
	{
		child = new TrieNode[26];
		count = 0;
	}
}

class Trie
{
	TrieNode head;

	Trie()
	{
		head = new TrieNode();
	}

	void addWord(String word)
	{
		TrieNode curr = head;
		for (int i = 0; i < word.length(); ++i)
		{
			int index = word.charAt(i)  - 'a';

			if (curr.child[index] == null)
			{
				curr.child[index] =  new TrieNode();
			} 
			curr = curr.child[index];
		}
		curr.count++;
	}

	boolean isWordPresent(String word)
	{
		TrieNode curr = head;
		for (int i = 0; i < word.length(); ++i)
		{
			int index = word.charAt(i)  - 'a';

			if (curr.child[index] == null)
			{
				return false;

			} 
			curr = curr.child[index];
		}
		return curr.count != 0;
	}
}