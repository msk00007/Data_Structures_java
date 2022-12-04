import java.util.*;

public class jq29 {

    // ==============================Quick-sort==========================
    public static int partition(int[] arr, int lb, int ub) {

        int i = lb;
        int j = ub;
        int pivot = arr[lb];
        while (i < j) {
            while (i <= ub && arr[i] <= pivot) {
                i++;

            }
            while (j > lb && arr[j] > pivot) {
                j--;

            }
            if (i < j) {

                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[lb] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void quick(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int pos = partition(arr, lb, ub);
            quick(arr, lb, pos);
            quick(arr, pos + 1, ub);
        }
    }

    // ============================merge-sort=====================================
    public static void merge(int a[], int lb, int mid, int ub) {
        int n = ub - lb + 1;
        int newarr[] = new int[n];

        int i = lb;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ub) {
            if (a[i] < a[j]) {
                newarr[k] = a[i];
                i++;
                k++;
            } else {
                newarr[k] = a[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            newarr[k] = a[i];
            i++;
            k++;
        }
        while (j <= ub) {
            newarr[k] = a[j];
            j++;
            k++;
        }

        for (int s = 0, y = lb; s < n; y++, s++) {

            a[y] = newarr[s];

        }

    }

    public static void mergeSort(int[] m, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(m, lb, mid);
            mergeSort(m, mid + 1, ub);
            merge(m, lb, mid, ub);
        }
    }

    // =====================Insertion_sort================================
    public static void Insertion(int[] l, int lb, int ub) {
        for (int i = 1; i <= ub; i++) {
            int temp = l[i];
            int j = i - 1;
            while (j >= 0 && l[j] > temp) {
                l[j + 1] = l[j];
                j--;
            }
            l[j + 1] = temp;
        }
    }

    // ====================selection_Sort================================
    public static void selection_Sort(int[] l, int lb, int ub) {
        for (int i = lb; i < ub; i++) {
            int min = i;
            for (int j = i + 1; j <= ub; j++) {
                if (l[min] > l[j]) {
                    min = j;
                }
            }
            if (l[i] != l[min]) {
                int temp = l[i];
                l[i] = l[min];
                l[min] = temp;
            }
        }
    }

    // =========================Bubble_sort============================
    public static void B_Sort(int[] l, int lb, int ub) {
        for (int i = lb; i < ub; i++) {
            for (int j = 0; j < ub - i; j++) {
                if (l[j] > l[j + 1]) {
                    int temp = l[j];
                    l[j] = l[j + 1];
                    l[j + 1] = temp;
                }
            }
        }
    }

    // print list code............................
    public static void printlist(int[] l) {
        for (int i = 0; i < l.length; i++) {
            System.out.print(l[i] + " ");
        }
    }

    // =================================MAIN===============================
    public static void main(String[] args) {
        System.out.println("Enter the num of elements..");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("list is empty ");
            sc.close();
            return;
        }

        System.out.println("Enter the elements:  ");

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[i] = x;
        }
        System.out.println("1.B_Sort__2.Selection_Sort");
        System.out.println("3.merge-Sort..__4.Quick_sort__5.Insertion-sort");
        boolean flag = true;
        while (flag) {
            System.out.println(" \n select your option.......");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    jq29.B_Sort(a, 0, n - 1);
                    jq29.printlist(a);
                    break;
                case 2:
                    jq29.selection_Sort(a, 0, a.length - 1);
                    jq29.printlist(a);
                    break;
                case 3:
                    jq29.mergeSort(a, 0, a.length - 1);
                    jq29.printlist(a);
                    break;
                case 4:
                    jq29.quick(a, 0, a.length - 1);
                    jq29.printlist(a);
                    break;
                case 5:
                    jq29.Insertion(a, 0, a.length - 1);
                    jq29.printlist(a);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("choose correct option.....0!0");
                    break;
            }
        }
        sc.close();
    }
}