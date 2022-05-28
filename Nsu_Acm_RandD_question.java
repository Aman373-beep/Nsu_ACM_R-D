
package new_project;
import java.util.*;
class photograph{
    private int height,width; static int z = 0;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public photograph(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public photograph(){
        z++;
    }
    public static void print(){
        System.out.println("Number of pics re-sized till far: "+ z);
    }
}
public class Nsu_Acm_RandD_question {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        photograph p[] = new photograph[100];
        int i =0;
        System.out.println("You will be re-sizing till 100 phots done");
        while(true){
            p[i] = new photograph();
            System.out.println("Enter the height for this photo:");
            p[i].setHeight(cs.nextInt());
            System.out.println("Also plcae that photos width:");
            p[i].setWidth(cs.nextInt());
            i++;
            if(i==100){break;}
        }
    }
    
    
}
