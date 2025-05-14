public class fibanaccisSeries{
    public static void main(String [] args){
        int n=10;
        int first=0,secound=1;

        System.out.println("fibanocci series up to " + n + "terms");

        for (int i=1;i<n;i++){
            System.out.println(first + " ");

            int next = first +secound;
            first = secound;
            secound = next;
        }
    }
}