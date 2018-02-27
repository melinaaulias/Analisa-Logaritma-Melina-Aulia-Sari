import java.util.Scanner;
public class ArrayTugasMelina {
	public static void main (String args[]) {
		Scanner masuk = new Scanner (System.in) ;
		Mahasiswa[] mhs = new Mahasiswa[2] ;
		for (int m=0;m<mhs.length; m++) {
		System.out.println ("Data Mahasiswa "+(m+1));
		System.out.print ("Nama Mahasiswa	: ");
		String nama = masuk.next();
		System.out.print ("NIM Mahasiswa	: ");
		String nim = masuk.next();
		System.out.print ("IPK Mahasiswa	: ") ;
		double ipk = masuk.nextDouble();
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setnama(nama);
		mahasiswa.setnim(nim);
		mahasiswa.setipk(ipk);
		mhs[m] = mahasiswa;
	}
	    for (int m=0; m<mhs.length; m++) {
	}
    }
}

class Mahasiswa {
	private String nama;
	private String nim;
	private double ipk;
	
	public void setnama(String nama) {
		this.nama = nama; 
	}
	public void setnim (String nim) {
		this.nim = nim; 
	}
	public void setipk (Double ipk) {
		this.ipk = ipk; 
	}
}