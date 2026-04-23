
import java.util.ArrayList;

public class activity{
    public static void main(String[] args) {
        int start[] = {1,3,8,5,8,5};
        int end[] = {2,4,6,8,9,19};

        //end time basis sort//
        
        int maxAct = 0; //variable1
        ArrayList<Integer> ans = new ArrayList<>(); //variable2
        //activity selection

        maxAct =1;
        ans.add(0);

        int lastend = end[0];

        for(int i=0; i<end.length; i++){
            if(start[i] >= lastend){
                maxAct++;

                ans.add(i);

                lastend = end[i];
            }
        }

        System.out.println("max activities = " +maxAct);
        for(int i= 0; i<ans.size();i++){
            System.out.println("A" + ans.get(i)+ " ");
        }
        System.out.println();
    }
}