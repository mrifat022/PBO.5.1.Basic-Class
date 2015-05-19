public class Lingkaran 
{
	private int jari2;
	private double luas_Lingkaran;
	private double kel_Lingkaran;

	public Lingkaran(int r){
		jari2 = r;
	}

	public void CetakLingkaran(){
		System.out.println("=== LINGKARAN ===");
		System.out.println("Jari-Jari lingkaran = " +jari2);
	}

	public void HitungLingkaran(){
		luas_Lingkaran = Math.PI*jari2*jari2;
		System.out.println("Luas Lingkaran      : 3,14 X jari-jari X jari-jari = " +luas_Lingkaran);

		kel_Lingkaran = Math.PI*(jari2+jari2);
		System.out.println("Kelililng Lingkaran : 3,14 X Diameter = " +kel_Lingkaran);
	}
}