import java.util.*;

public class Linkedlist2 {
    node tale;
    node c;

    public class node {
        int info;
        node next = null;

        node(int x) {
            info = x;
            next = null;
        }
    }

    // -----------------------Search code-------------------------
    public node L_search(node l, int key) {
        node newnode = l;
        if (newnode == null) {
            return c;
        }
        int x = key;
        while (newnode != null) {
            if (newnode.info == x) {
                return newnode;
            } else {
                newnode = newnode.next;
            }
        }
        return null;
    }

    // -----------------------delete code----------------------------
    public void delete(node start, node position) {
        if (start == null) {
            System.out.println("Delete------>the list is empty");
            return;
        } else if (start == position) {
            start = start.next;
            c = start;
            return;
        }
        node prev = null;
        node current = start;
        while (current != null && current != position) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("location is not found");
            return;
        } else if (current == position) {
            prev.next = current.next;
        }
    }

    // -----------------------append code----------------------------
    void append(int x) {

        node t = new node(x);
        if (tale == null) {
            tale = t;
            c = t;
        } else {
            tale.next = t;
            tale = tale.next;
        }

    }

    // ------------------------push code------------------------------
    public void front(int x) {
        node new_node = new node(x);
        if (tale == null) {
            new_node.next = c;
            tale = new_node;
            c = new_node;
        } else {
            new_node.next = c;
            c = new_node;
        }
    }

    // ------------------------print list code------------------------------
    void printlist(node c) {
        node f = c;
        if (f == null) {
            System.out.println("list is empty");
            return;
        }
        while (f != null) {
            // System.out.println(f.next);
            System.out.print(f.info + "-->");
            f = f.next;
        }
    }

    // ------------------------insertion after code-----------------------------
    void insert_after(int pos, int new_elem) {
        node new_node = new node(new_elem);
        if (c == null) {
            System.out.println("list is empty choose push or append");
            return;
        }
        node location = L_search(c, pos);
        if (location == null) {
            System.out.println("element you want to insert_before is not in the list");
            return;
        } else {
            if (location.next == null) {
                location.next = new_node;
                tale = location.next;
            } else {
                new_node.next = location.next;
                location.next = new_node;
            }
        }

    }

    void insert_before(int pos, int new_elem) {
        node new_node = new node(new_elem);
        node temp = c;
        if (temp == null) {
            System.out.println("list is empty so choose push or append");
            return;
        } else if (temp.info == pos) {
            new_node.next = temp;
            c = new_node;
        } else {
            node next_node = temp.next;
            while (next_node != null && next_node.info != pos) {
                temp = next_node;
                next_node = next_node.next;
            }
            if (next_node == null) {
                System.out.println("element position you entered is not found :");
                return;
            } else {
                new_node.next = next_node;
                temp.next = new_node;
            }

        }

    }

    // sorting...............................................................
    public void Sortinglist() {
        node current = c;
        int temp;
        if (c == null) {
            return;
        } else {
            while (current != null) {
                node Nextindex = current.next;
                while (Nextindex != null) {
                    if (current.info > Nextindex.info) {
                        temp = current.info;
                        current.info = Nextindex.info;
                        Nextindex.info = temp;
                    }
                    Nextindex = Nextindex.next;
                }
                current = current.next;
            }
        }
    }

    // -------------------------MAIN code-----------------------------------
    public static void main(String[] args) {
        Linkedlist2 l = new Linkedlist2();
        Scanner sc = new Scanner(System.in);

        // ===============================switch_Cases=====================================
        System.out.println("Enter which operation you want to perform:");
        System.out.println("1.insert at start..2-insert at the end..3-insert after an element");
        System.out.println("4-search \n 5-delete an element..6-insert before..7.printlist .0-exit");
        boolean flag = true;
        while (flag) {
            System.out.println("\n enter your option");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter the number");
                    int num = sc.nextInt();
                    l.front(num);
                    break;
                case 2:
                    System.out.println("\n enter the number");
                    int num2 = sc.nextInt();
                    l.append(num2);
                    break;
                case 3:
                    System.out.println("enter the element to be insert");
                    int e = sc.nextInt();
                    System.out.println("enter the postion element ");
                    int p = sc.nextInt();
                    l.insert_after(p, e);
                    break;
                case 4:
                    System.out.print("enter the element to be searched--");
                    int keyy = sc.nextInt();
                    node r = l.L_search(l.c, keyy);
                    if (r == l.c) {
                        System.out.println("Search---->>>list is empty....");
                    } else if (r != null) {
                        System.out.println("Search---->>>location found" + r);
                    } else {
                        System.out.println("Search---->>>location not found");
                    }
                    break;
                case 5:
                    System.out.println("enter the element to be deleted....");
                    int del_elem = sc.nextInt();
                    node del_pos = l.L_search(l.c, del_elem);
                    l.delete(l.c, del_pos);
                    break;
                case 6:
                    System.out.println("enter the elemet to be inserted");
                    num = sc.nextInt();
                    System.out.println("enter the position element...");
                    p = sc.nextInt();
                    l.insert_before(p, num);
                    break;
                case 7:
                    l.printlist(l.c);
                    break;
                case 0:
                    flag = false;
                    break;

                default:
                    System.out.println("enter correct option");
                    option = sc.nextInt();
                    break;

            }
        }

        l.Sortinglist();
        l.printlist(l.c);

        sc.close();

    }
}