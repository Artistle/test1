import java.io.IOException;
import java.util.ArrayList;

public class main2 {
    public static void main(String args[]) throws IOException {
        ArrayList<Integer> price = new ArrayList<>();
        int offset = 2;
        int discount = 50;
        int readLength = 4;

        price.add(10);
        price.add(17);
        price.add(23);
        price.add(84);
        price.add(64);
        price.add(73);
        price.add(51);
        price.add(7);

        int[] p = discont(price,offset,discount,readLength);

        for(int i = 0;i < p.length; i++){
            System.out.println(p[i]);
        }
    }

    public static int[] discont(ArrayList<Integer> price, int offset, int discount, int readLength){
        int[] new_price = new int[readLength];
        int t = 0;

        for(int i = 0; i< price.size() ; i++){
            if(i >= offset && i< readLength+offset){
                new_price[t] = (int) Math.floor((price.get(i) - (price.get(i) * discount / 100)));
                t+=1;
            }
        }
        return new_price;
    }
}
