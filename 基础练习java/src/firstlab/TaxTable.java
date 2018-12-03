package firstlab;



public class TaxTable {

	static double single(int num)
	{
		if(num<=7300)
			return num*0.1;
		else if(num<=29700)
			return 730+0.15*(num-7300);
		else if(num<=59975)
			return 4090+0.25*(num-29700);
		else if(num<=91400)
			return 11658.75+0.28*(num-59975);
		else if(num<=163225)
			return 20457.75+0.33*(num-91400);
		else
			return 44160+0.35*(num-163225);
	}
	static double marrage(int num)
	{
		if(num<=14600)
			return num*0.1;
		else if(num<=59400)
			return 1460+0.15*(num-14600);
		else if(num<=119950)
			return 8180+0.25*(num-59400);
		else if(num<=182800)
			return 23317.5+0.28*(num-119950);
		else if(num<=326450)
			return 40915.5+0.33*(num-182800);
		else
			return 88320+0.35*(num-326450);
	}
	static double saparately(int num)
	{
		if(num<=7300)
			return num*0.1;
		else if(num<=29700)
			return 730+0.15*(num-7300);
		else if(num<=59975)
			return 4090+0.25*(num-29700);
		else if(num<=91400)
			return 11658.75+0.28*(num-59975);
		else if(num<=163225)
			return 20457.75+0.33*(num-91400);
		else
			return 44160+0.35*(num-163225);
	}
	static double household(int num)
	{
		if(num<=10450)
			return num*0.1;
		else if(num<=39800)
			return 1045+0.15*(num-10450);
		else if(num<=102800)
			return 5447.50+0.25*(num-39800);
		else if(num<=166450)
			return 21197.50+0.28*(num-102800);
		else if(num<=326450)
			return 39019.50+0.33*(num-166450);
		else
			return 91819.50+0.35*(num-326450);
	}
	public static void main(String[] args) {
		System.out.print("taxableIncome  ");
		System.out.print("Single         ");
		System.out.print("MarriedJoint   ");
		System.out.print("MarriedSeparate");
		System.out.println("Head of a House");
		//Ò»ÁÐ15¸ö×Ö·û
		for(int i=50000;i<=60000;i=i+50)
		{
			System.out.printf("%15d",i);
			double sin=single(i);
			System.out.printf("%15f",sin);
			double mar=marrage(i);
			System.out.printf("%15f",mar);
			double sep=saparately(i);
			System.out.printf("%15f",sep);
			double hos=household(i);
			System.out.printf("%15f\n",hos);
		}
	}

}
