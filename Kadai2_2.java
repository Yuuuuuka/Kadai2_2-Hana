import java.io.*;
class Kadai2_2{
	public static void main(String args[])throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("JnÊuÌxÀW");
		String str1=br.readLine();
		int x=Integer.parseInt(str1);
		
		System.out.println("JnÊuÌyÀW");
		String str2=br.readLine();
		int y=Integer.parseInt(str2);
		
		System.out.println("ÆÌ³");
		String str3=br.readLine();
		int d=Integer.parseInt(str3);
		
		System.out.println("®ªÌpx");
		String str4=br.readLine();
		int a=Integer.parseInt(str4);
		
		TurtleFrame f= new TurtleFrame();
		
		
		Turtle m=new Turtle(x,y,0);
		
		java.awt.Color c
			=new java.awt.Color(0,0,255);//ÂFIuWFNgð¶¬
		m.setColor(c);//mÌFðÂFÉwè
		
		f.add(m);
		
		m.fd(d);//Ó1
		m.lt(90);//¶É90ñ]
		
		m.fd(d/2);//Ó2
		
		m.rt(180 - a);//EÉañ](Ó2Æ3ÌÔ)
		
		m.fd(d);//Ó3
		
		m.rt(a);//Ó3Æ4ÌÔÌp
		m.fd(d*2);//Ó4
		
		m.rt(a);//Ó4Æ5ÌÔÌp
		m.fd(d);//Ó5
		m.rt(180 - a);//Ó5Æ6ÌÔÌp
		m.fd(d/2);//Ó6
		m.lt(90);//¶É90ñ]
		m.fd(d);//Ó7
	}
}
