import java.util.Scanner;

class Informasi{
	
	String nama, alamat;
	char blok;
	int tipe, bayar;
	int harga = 0;
	int kembalian;
	boolean loop = true;
	
	
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
		System.out.println("    	   B       Rp. 300.000 ");
		System.out.println(" 37  	   A       Rp. 800.000 ");
		System.out.println("    	   B	   Rp. 600.000 ");
		System.out.println("");
		
		Informasi info = new Informasi();
		Scanner input = new Scanner(System.in);
		System.out.print("Input Nama = ");
		info.nama = input.nextLine();
		System.out.print("Input Alamat = ");
		info.alamat = input.nextLine();	
		
		while(info.loop)
    	{
    		System.out.print("Input Tipe (36/37) : ");
			info.tipe = input.nextInt();
    		switch(info.tipe)
	    	{
	    		case 36 :
	    			System.out.print("Silahkan pilih Blok (A/B) : ");
              		info.blok = input.next().charAt(0);
              		if (info.blok == 'A' || info.blok == 'a'){
              			info.harga = 500000;
              		}
              		else if (info.blok == 'B' || info.blok == 'b'){
              			info.harga = 300000;
              		}
              		else{
              			System.out.println("Tipe yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;              			
              		}
              		              		
	    			info.loop = false;
	    			break;
	    			
	    		case 37 :
	    			System.out.print("Silahkan pilih Blok (A/B) : ");
              		info.blok = input.next().charAt(0);
              		if (info.blok == 'A' || info.blok == 'a'){
              			info.harga = 800000;
              		}
              		else if (info.blok == 'B' || info.blok == 'b'){
              			info.harga = 600000;
              		}
              		else{
              			System.out.println("Tipe yang anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;
              			
              		}
              		
	    			info.loop = false;
	    			break;
	    			
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih Ulang");
	    			System.out.println("");
	    			break;
	    	}
    	}
    	
    	System.out.println("Harga bayar = Rp. " + info.harga);
    	
    	while(info.bayar < info.harga){
		System.out.print("Input Jumlah Bayar = Rp. ");
		info.bayar = input.nextInt();
			if (info.bayar > info.harga){
				info.kembalian = info.bayar - info.harga;
			}
			else if (info.bayar < info.harga){
				System.out.println("Uangnya kurang. Silahkan ditambah");
				System.out.println("");
			}
		}		
				
		info.cetak();
	}
}