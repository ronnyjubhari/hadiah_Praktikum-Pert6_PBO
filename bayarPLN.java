import java.util.Scanner;

class Tagihan{
	
	String nama, alamat;
	char blok;
	int tipe, bayar, harga, kembalian;
	
	
	void proses(){
		
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		
		while(loop)
    	{
    		System.out.print("Input Tipe (36/37) : ");
			tipe = input.nextInt();
    		switch(tipe)
	    	{
	    		case 36 :
	    			System.out.print("Silahkan pilih Blok (A/B) : ");
              		blok = input.next().charAt(0);
              		if (blok == 'A' || blok == 'a'){
              			harga = 500000;
              		}
              		else if (blok == 'B' || blok == 'b'){
              			harga = 300000;
              		}
              		else{
              			System.out.println("Tipe yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;              			
              		}
              		              		
	    			loop = false;
	    			break;
	    			
	    		case 37 :
	    			System.out.print("Silahkan pilih Blok (A/B) : ");
              		blok = input.next().charAt(0);
              		if (blok == 'A' || blok == 'a'){
              			harga = 800000;
              		}
              		else if (blok == 'B' || blok == 'b'){
              			harga = 600000;
              		}
              		else{
              			System.out.println("Tipe yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;
              			
              		}
              		
	    			loop = false;
	    			break;
	    			
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih Ulang");
	    			System.out.println("");
	    			break;
	    	}
    	}
    	
    	System.out.println("Harga bayar = Rp. " + harga);
    	
    	while(bayar < harga){
		System.out.print("Input Jumlah Bayar = Rp. ");
		bayar = input.nextInt();
			if (bayar > harga){
				kembalian = bayar - harga;
			}
			else if (bayar < harga){
				System.out.println("Uangnya kurang. Silahkan input nominal yang lebih besar dari harga bayar");
				System.out.println("");
			}
		}		
	}
	
	
	void cetak(){
		System.out.print("\n\n"); 	   	
    	System.out.println("-------------STRUK-------------");    	
		System.out.println("Nama         : " + nama);
		System.out.println("Alamat       : " + alamat);
		System.out.println("Harga Bayar  : Rp. " + harga);
		System.out.println("Pembayaran   : Rp. " + bayar);
		System.out.println("Kembalian    : Rp. " + kembalian);
	}
}

public class bayarPLN{
	public static void main(String args[]){	
		
		System.out.println("Tipe      Blok         Harga   ");
		System.out.println(" 36        A       Rp. 500.000 ");
		System.out.println(" 36   	   B       Rp. 300.000 ");
		System.out.println(" 37  	   A       Rp. 800.000 ");
		System.out.println(" 37   	   B	   Rp. 600.000 ");
		System.out.println("");
		
		Tagihan info = new Tagihan();
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nama = ");
		info.nama = input.nextLine();
		
		System.out.print("Input Alamat = ");
		info.alamat = input.nextLine();	
				
		info.proses();		
		info.cetak();
	}
}