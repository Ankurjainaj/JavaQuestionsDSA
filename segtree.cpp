#include<bits/stdc++.h>
using namespace std;

struct Node{
    map<char, Node*> links;
    int endsWith;
    int prefix;

    Node(){
        endsWith=0;
        prefix=0;
    }
};

class Trie{
    public:
    Node* root;

    Trie()
    {
        root = new Node();
    }

    void indert(string word)
    {
        Node *node = root;
        for(int i=0;i<word.size();i++)
        {
            if(!node->links[word[i]])
            {
                node->links[word[i]] = new Node();
            }
            node = node->links[word[i]];
            node->prefix++;
        }
        node->endsWith++;
    }

    int countStartsWith(string word)
    {
        Node* node = root;
        for(int i=0;i<word.size();i++)
        {
            if(node->links[word[i]])
            {
                node = node->links[word[i]];
            }
            else
            {
                return 0;
            }
        }
        return node->prefix;
    }

    int countEndsWith(string word)
    {
        Node* node = root;
        for(int i=0;i<word.size();i++)
        {
            if(node->links[word[i]])
            {
                node = node->links[word[i]];
            }
            else
            {
                return 0;
            }
        }
        return node->endsWith;
    
    }

    void erase(string word)
    {
        
    
        Node* node = root;
        for(int i=0;i<word.size();i++)
        {
            if(node->links[word[i]])
            {
                node = node->links[word[i]];
                node->prefix--;
            }
            else
            {
                return ;
            }
        }
         node->endsWith--;
    
    }
};
