package Trees.BinarySearchTrees;

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
    void inorder(Node troot){
        if(troot!=null){
            inorder(troot.left);
            System.out.print(troot.val+" ");
            inorder(troot.right);

        }
    }

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

    public static void main(String[] args) {
        BinarySearchTree t=new BinarySearchTree();
        t.insert(t.root, 50);
        t.insert(t.root, 30);
        t.insert(t.root, 80);
        t.insert(t.root, 10);
        t.insert(t.root, 40);
        t.insert(t.root, 60);
        t.inorder(t.root);
        System.out.println("recursive insert");
        BinarySearchTree b=new BinarySearchTree();
        b.root=b.rInsert(b.root, 20);
        b.rInsert(b.root, 40);
        b.rInsert(b.root, 60);
        b.rInsert(b.root, 80);
        b.rInsert(b.root, 100);
        b.inorder(b.root);


    }

}
