import java.io.*;
class Kadai2_2{
	public static void main(String args[])throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("�J�n�ʒu��x���W");
		String str1=br.readLine();
		int x=Integer.parseInt(str1);
		
		System.out.println("�J�n�ʒu��y���W");
		String str2=br.readLine();
		int y=Integer.parseInt(str2);
		
		System.out.println("�Ƃ̍���");
		String str3=br.readLine();
		int d=Integer.parseInt(str3);
		
		System.out.println("�����̊p�x");
		String str4=br.readLine();
		int a=Integer.parseInt(str4);
		
		TurtleFrame f= new TurtleFrame();
		
		
		Turtle m=new Turtle(x,y,0);
		
		java.awt.Color c
			=new java.awt.Color(0,0,255);//�F�I�u�W�F�N�g�𐶐�
		m.setColor(c);//m�̐F��F�Ɏw��
		
		f.add(m);
		
		m.fd(d);//��1
		m.lt(90);//����90����]
		
		m.fd(d/2);//��2
		
		m.rt(a);//�E��a����](��2��3�̊�)
		
		m.fd(d);//��3
		
		m.rt(180-a);//��3��4�̊Ԃ̊p
		m.fd(d*2);//��4
		
		m.rt(180-a);//��4��5�̊Ԃ̊p
		m.fd(d);//��5
		m.rt(a);//��5��6�̊Ԃ̊p
		m.fd(d/2);//��6
		m.lt(90);//����90����]
		m.fd(d);//��7
	}
}