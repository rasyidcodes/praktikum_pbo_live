import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("banyak barang");
        int bnykBarang = scanner.nextInt();

        ArrayList<Belanja> belanjas = new ArrayList<Belanja>();

        for (int i =0; i < bnykBarang ; i++){
            System.out.println("nama");
            String nama = scanner.next();
            System.out.println("harga");
            int harga = scanner.nextInt();
            belanjas.add(new Belanja(nama, harga));
        }

        for (int i =0; i < belanjas.size(); i++){
            System.out.println(belanjas.get(i).getNama());
        }




    }
}