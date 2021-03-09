import java.lang.*;
import java.util.*;
class SortSen {
    String sen;
    String[] words;
    int len;
    SortSen(String s) {
        this.sen = s;
        words = sen.split(" ");
        len =words.length;
        int c;
        for(int i=0;i<len;i++) {
            c=0;
            for(int j=0;j<words[i].length(); j++) {
                if((words[i].charAt(j)>=65 && words[i].charAt(j)<=90) || (words[i].charAt(j)<=122 && words[i].charAt(j)>=97)){
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.println("There is a String with only numeric value(s)/special character(s) at "+(i+1));
        }
    }
    void sortAsc() {
        String temp;
        for(int i=0; i<len; i++) {
            for(int j=0; j<len-i-1; j++) {
                if(words[j].compareTo(words[j+1]) > 0) {
                    temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
    
        System.out.println("The sorted sentence is as follows: ");
        for(int i=0;i<len;i++) {
            System.out.print(words[i]+" ");
        }
    }
    void sortDesc() {
        String temp;
        for(int i=0; i<len; i++) {
            for(int j=0; j<len-i-1; j++) {
                if(words[j].compareTo(words[j+1]) > 0) {
                    temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted sentence is as follows: ");
        for(int i=len-1;i>=0;i--) {
            System.out.print(words[i]+" ");
        }
    }
}
class OrderWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter the sentence: ");
        s = sc.nextLine();
        SortSen str = new SortSen(s);
        int ch;
        System.out.println("In what order you want to order the words of the sentence?\n1.ASCENDING\nor\n2.DESCENDING");
        ch = sc.nextInt();
        switch(ch) {
            case 1:
                str.sortAsc();
                break;

            case 2:
                str.sortDesc();
                break;

            default:
                System.out.println("put a valid choice.");
                break;
        }
        sc.close();
    }
}