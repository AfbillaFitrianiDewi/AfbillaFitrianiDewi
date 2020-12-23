
/**
 *
 * @author AFBILLA FITRIANI DEWI
 */
import java.util.*;
public class Tumpukan {
    static void showPush(Stack st,int a){
        st.push(new Integer(a));
        System.out.println("Push (" +a+ ")");
        System.out.println("Stack: "+st);
    }
    
    static void showPop(Stack st){
        System.out.print("Pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }
    
    public static void main(String[] args){
        Stack st = new Stack();
        System.out.println("Stack: "+st);
        showPush(st, 7);
        showPush(st, 90);
        showPush(st, 15);
        showPop(st);
        showPop(st);
        showPop(st);
        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("Error Afbilla, pesan:"+e.getMessage());
        }
    }
}
