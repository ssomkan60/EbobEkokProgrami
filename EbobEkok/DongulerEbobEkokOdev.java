import java.util.Scanner;
public class DongulerEbobEkokOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y,ebob=1,ekok=1;
        int i=1;

        System.out.print("X Sayısını Giriniz:");
        x = input.nextInt();
        System.out.print("Y Sayısını Giriniz:");
        y = input.nextInt();

        while (i<=x){
            if(x%i == 0 && y%i == 0){
                ebob = i;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println("Ebob Değeri:"+ ebob);

        while (i <= (x*y)){
            if(i%x == 0 && i%y == 0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Ekok Değeri:"+ekok);
        /*
        int ekok = (x*y)/ebob;
        System.out.println("Ekok Değeri:"+ ekok);
        */
    }
}
