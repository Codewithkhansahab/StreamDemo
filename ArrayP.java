import java.util.Scanner;

class ArrayP {
    public static void main(String[] args) {
        int a[] = {1, 12, 28, 46, 74, 98};
        int l = 0, h = a.length - 1, mid = 0, i, s, flag = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();

        while(l<=h) {
            mid = (l + h) / 2;
            if (a[mid] == s) {
                flag = 1;
                break;
            }
            else if(s>a[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            }

            if (flag == 1) {
                System.out.println("element is present");
            } else {
                System.out.println("element is not present");
            }
        }
    }

