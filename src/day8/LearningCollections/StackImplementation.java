package day8.LearningCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);


         st.add(5);

        System.out.println(st.empty());
        System.out.println(st.pop());
        System.out.println(st.peek());


        //checking if they can hold null values
        st.add(null);

        ArrayList<Integer>list = new ArrayList<>();
        list.add(null);
        System.out.println(list);
        List<Integer>list1 = new LinkedList<>();
        list1.add(null);
        System.out.println(list1);



    }
}
