public class Segitiga 
{
	private int alas;
	private int tinggi;
	private int garis_Miring;
	private double luas;
	private double keliling;

	public Segitiga(int a, int t, int gm)
	{
		alas = a;
		tinggi = t;
		garis_Miring = gm;
	}

	public void CetakSegitiga()
	{
		System.out.println("=== SEGITIGA ===");
		System.out.println("Alas        = " +alas);
		System.out.println("Tinggi      = " +tinggi);
		System.out.println("Sisi Miring = " +garis_Miring);
	}

	public void HitungSegitiga()
	{
		luas = 0.5*alas*tinggi;
		System.out.println("Luas Segitiga     : alas x tinggi = " +luas);

		keliling = alas+tinggi+garis_Miring;
		System.out.println("Keliling Segitiga : alas + tinggi + Sisi miring = " +keliling);
	}
}