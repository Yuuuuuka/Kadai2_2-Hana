import java.io.*;
class Kadai2_2{
	public static void main(String args[])throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("開始位置のx座標");
		String str1=br.readLine();
		int x=Integer.parseInt(str1);
		
		System.out.println("開始位置のy座標");
		String str2=br.readLine();
		int y=Integer.parseInt(str2);
		
		System.out.println("家の高さ");
		String str3=br.readLine();
		int d=Integer.parseInt(str3);
		
		System.out.println("屋根の角度");
		String str4=br.readLine();
		int a=Integer.parseInt(str4);
		
		TurtleFrame f= new TurtleFrame();
		
		
		Turtle m=new Turtle(x,y,0);
		
		java.awt.Color c
			=new java.awt.Color(0,0,255);//青色オブジェクトを生成
		m.setColor(c);//mの色を青色に指定
		
		f.add(m);
		
		m.fd(d);//辺1
		m.lt(90);//左に90°回転
		
		m.fd(d/2);//辺2
		
		m.rt(180 - a);//右にa°回転(辺2と3の間)
		
		m.fd(d);//辺3
		
		m.rt(a);//辺3と4の間の角
		m.fd(d*2);//辺4
		
		m.rt(a);//辺4と5の間の角
		m.fd(d);//辺5
		m.rt(180 - a);//辺5と6の間の角
		m.fd(d/2);//辺6
		m.lt(90);//左に90°回転
		m.fd(d);//辺7
	}
}
