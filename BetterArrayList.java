import java.util.ArrayList;
public class BetterArrayList<E> extends ArrayList <E> {

    public E pop(){
        if(!isEmpty()){
            return remove(0);
        }else{
            throw new IndexOutOfBoundsException("List is empty");
        }
    }
    

    public static void main(String[] args) {
        BetterArrayList<Integer> betterList = new BetterArrayList<>();
        betterList.add(10);
        betterList.add(20);
        betterList.add(30);

        System.out.println("Original list: " + betterList); // Output: [10, 20, 30]

        int poppedValue = betterList.pop();
        System.out.println("Popped value: " + poppedValue); // Output: 10
        System.out.println("List after pop: " + betterList); // Output: [20, 30]
    }
}
