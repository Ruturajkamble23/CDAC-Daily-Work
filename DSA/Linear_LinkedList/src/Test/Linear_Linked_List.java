package Test;
public class Linear_Linked_List {
    Node root;

    void create_List() {
        root = null;
    }

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null)
            root = n;//first
        else {
            n.next = root;//1
            root = n; //2
        }
        System.out.println(data + " inserted");
    }

    void delete_left() {

        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;//1
            root = root.next;//2
            System.out.println(t.data + " deleted");//3
        }

    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null)
            root = n;//first
        else {
            Node t = root;//1
            while (t.next != null)//2
                t = t.next;
            t.next = n;//3
        }
        System.out.println(data + " inserted");
    }

    void delete_right() {

        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;//1
            Node t2 = root;//1
            while (t.next != null)//2
            {
                t2 = t;
                t = t.next;
            }
            if (root == t)
                root = null;//3 single node
            else
                t2.next = null;//3
            System.out.println(t.data + " deleted");//3
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("\nList Empty");
        else {
            Node t = root;//1
            while (t != null)//2
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

    boolean search(int key) {
        if (root == null) {
            System.out.println("list empty");
        } else {
            Node t = root;
            while (t != null) {

                if (key == t.data)
                    return true;
                t = t.next;
            }


        }
        return false;
    }

    void delete_element(int key)
    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t =root;//1 Node t2=root;//1 while(t!=null)//2
            Node t2 =root;
            if(key==t.data)
                while(t!=null){
                    if(key==t.data)
                        break;
                    t2=t;
                    t=t.next;
                }if(t!=null) {
            if(t==root)
                root=root.next;
            else if(t.next==null)
                t2.next=null;
            else
                t2.next=t.next;
            System.out.println(t.data+"deleted");

        }else
            System.out.println(key+"not found");
        }

        }

    void insert_after(int ref, int data)

    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//ref
            while(t!=null)//2
            {
                if(ref==t.data)
                    break;
                t=t.next;
            }
            if(t!=null)//found
            {
                Node n=new Node(data);//new node created

                n.next=t.next;//1

                t.next=n;//2

                System.out.println(data+" inserted in list");
            }
            else//not found
                System.out.println(ref+" not found in list ");
        }
    }

}


