public class updadtes {
    public static void update(int marks[]){
        int i;
        for (i=0; i<=marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]= {34,36, 34,41,45};
        update(marks);

    for(int i=0; i<=marks.length; i++){
        System.out.println(marks[i]+" ");
    }
    System.out.println();
   }
}