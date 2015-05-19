public class TestBangun 
{
	public static void main(String[] args) 
	{
		Segitiga seg = new Segitiga(3, 4, 5);
		seg.CetakSegitiga();
		System.out.println("");
		seg.HitungSegitiga();

		System.out.println();
		System.out.println();

		Lingkaran ling = new Lingkaran(14);
		ling.CetakLingkaran();
		System.out.println("");
		ling.HitungLingkaran();
	}
}