package Trees.BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public class Node{
        int val;
        Node left;
        Node right;
        Node(int value, Node l, Node r){
            val=value;
            left=l;
            right=r;
        }
    }

    Node root;
    BinarySearchTree(){
        root=null;
    }
//Insertions

    //Iterative Insertion
    public void insert(Node troot,int e){
        Node temp=null;// for storing parent of node to be inserted
        while(troot!=null){
            temp=troot;
            if(e==troot.val)
                return;
            else if(e<troot.val)
                troot=troot.left;
            else if(e>troot.val)
                troot=troot.right;
        }
        Node n=new Node(e,null,null);
        if(root!=null){
            if(e<temp.val)
                temp.left=n;
            else
                temp.right=n;
        }
        else
            root=n;

    }

    //Recursive Insertion
    Node rInsert(Node troot, int e){
        if(troot!=null){
            if(e< troot.val)
                troot.left=rInsert(troot.left,e);
            else if(e>troot.val)
                troot.right=rInsert(troot.right,e);
        }
        else{
            Node n=new Node(e,null,null);
            troot=n;

        }
        return troot;
    }
//Traversals
    void inorder(Node troot){
        if(troot!=null){
            inorder(troot.left);
            System.out.print(troot.val+" ");
            inorder(troot.right);
        }
    }

    void preorder(Node troot){
        if(troot!=null){
            System.out.print(troot.val+" ");
            preorder(troot.left);
            preorder(troot.right);
        }
    }

    void postorder(Node troot){
        if(troot!=null){
            postorder(troot.left);
            postorder(troot.right);
            System.out.print(troot.val+" ");
        }

    }
    void level() {
        Queue<Node> q = new LinkedList<>();
        Node t = root;
        System.out.print(t.val + " ");
        q.offer(t);
        while (!q.isEmpty()) {
            t = q.poll();
            if (t.left != null) {
                System.out.print(t.left.val + " ");
                q.offer(t.left);
            }
            if (t.right != null) {
                System.out.print(t.right.val + " ");
                q.offer(t.right);
            }
        }
    }
//Searching
        //Iterative Searching
        boolean search(int key){
            Node troot=root;
            while(troot!=null){
                if(key==troot.val)
                    return true;
                else if(key<troot.val)
                    troot=troot.left;
                else if(key>troot.val)
                    troot=troot.right;
            }
            return false;
        }

        //Recursive Searching
        boolean rSearch(Node troot,int key){
            if(troot==null)
                return false;
            else if(troot.val==key)
                return true;
            else if(key<troot.val)
                return rSearch(troot.left,key);
            else
                return rSearch(troot.right,key);
        }

        //Deletion
    boolean delete(int e){
        Node p=root;
        Node pp=null;
        while(p!=null && p.val!=e){
            pp=p;
            if(e<p.val)
                p=p.left;
            else
                p=p.right;
        }
        if(p==null)
            return false;
        if (p.left != null && p.right != null) {

            Node s=p.left;
            Node ps=p;
            while(s.right!=null){
                ps=s;
                s=s.right;
            }
            p.val=s.val;
            p=s;
            pp=ps;
        }
        Node c=null;
        if(p.left!=null)
            c=p.left;
        else
            c=p.right;
        if(p==root)
            root=null;
        else
            if(p==pp.left)
                pp.left=c;
            else
                pp.right=c;
        return true;
    }

    //Count no. of Nodes
    int count(Node troot){
        if(troot!=null){
            int x=count(troot.left);
            int y=count(troot.right);
            return x+y+1;
        }
        return 0;
    }
    //Height of tree
    int height(Node troot){
        if(troot!=null){
            int x=height(troot.left);
            int y=height(troot.right);
           if(x>y)
               return x+1;
           else
               return y+1;
        }
        return 0;
    }

    int myHeight(Node troot){
        if(troot!=null) {
            int x = 0, y = 0;
            Node r = troot;
            while (troot != null) {
                x++;
                troot = troot.left;
            }
            while (r != null) {
                y++;
                r = r.right;
            }
            return (int) Math.max(x, y) + 1;
        }

        return 0;
    }


    public static void main(String[] args) {
        BinarySearchTree t=new BinarySearchTree();
        t.insert(t.root, 50);
        t.insert(t.root, 30);
        t.insert(t.root, 80);
        t.insert(t.root, 10);
        t.insert(t.root, 40);
        t.insert(t.root, 60);
        t.insert(t.root, 90);
        t.inorder(t.root);
        System.out.println("recursive insert");
        BinarySearchTree b=new BinarySearchTree();
        b.root=b.rInsert(b.root, 10);
        b.rInsert(b.root, 40);
        b.rInsert(b.root, 30);
        b.rInsert(b.root, 60);
        b.rInsert(b.root, 90);
        b.rInsert(b.root, 80);
        b.rInsert(b.root, 50);
        b.inorder(b.root);
        System.out.println("");
        b.level();
        System.out.println("");
        b.preorder(t.root);
        System.out.println("");
        t.postorder(t.root);
        System.out.println(t.search(0));
        System.out.println(t.rSearch(t.root,10));
        System.out.println("");
        b.level();
        System.out.println("");
        b.delete(15);
        System.out.println("");
        b.level();
        System.out.println("");
        System.out.println(b.count(b.root));
        System.out.println(t.height(t.root)-1);
        System.out.println(b.myHeight(b.root)-1);


    }

}
