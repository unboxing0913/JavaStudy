package part01.sec01.exam01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

class Food{
	private String name;
	private int price;
	
	public Food(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}

class MyButton08 extends Button{
	private Image img;
	
	public MyButton08(Image img) {
		this.img=img;
	}
	
	public void paint(Graphics g) { //
		g.drawImage(img, 5, 5,this.getWidth()-10, this.getHeight()-10, this);
	}
	
	
}

class MyFrame09 extends JFrame implements ActionListener{
	
	private String[] name = new String[] {"짜 장 면","짬   뽕","순 대 국","뼈해장국","소불고기","제육볶음","소갈비찜","카레가스","청 국 장"};
	private int price[]=new int[] {5000,6000,7000,8000,8000,8000,10000,7000,7000};
	private String str = "주 문 내 역\n----------";
	
	private MyButton08 bt[]=new MyButton08[9];
	private Food[] food = new Food[9];
	
	private TextArea ta = new TextArea(str);
	private Panel center_p=new Panel();
	private Panel east_p=new Panel();
	
	private ArrayList<Food> list = new ArrayList<Food>(); //
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center",center_p);
		east_p.setPreferredSize(new Dimension(200,300));
		this.add("East",east_p);
		east_p.setLayout(new BorderLayout());
		east_p.add("Center",ta);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0;i<bt.length;i++) {
			//이미지 가져와서 버튼에 적용하기 , Food클래스에 음식명과 가격 적용하기,버튼을 패널에 배치하기
			Image img = Toolkit.getDefaultToolkit().getImage("images\\food"+(i+1)+".png");	//		
			bt[i] = new MyButton08(img);
			food[i] = new Food(name[i],price[i]);
			center_p.add(bt[i]);
			
		} 
			
	/*		File sourceimage = new File("C:\\java-emp-class-0824\\java-lecture\\java-workspace\\Chapter20\\images");
			Image[] image = new Image[i]; 
			try {
				image[i]=ImageIO.read(sourceimage);
			} catch (IOException e) {
				e.getMessage();				
			}
		    bt[i]= new MyButton08(image[i]);
 		    food[i] = new Food(name[i],price[i]);
 		    center_p.add(bt[i]);
 		    
		}		 */
		
	}
	
	public void start() {
		for(int i=0;i<bt.length;i++) {
			bt[i].addActionListener(this);
		}
	}
	
	public MyFrame09(String title) {
		super(title);
		this.init();
		this.start();
		this.setSize(500, 300);
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int xpos = (int)(screen.getWidth()/2)-this.getWidth()/2;
	    int ypos = (int)(screen.getHeight()/2)-this.getHeight()/2;
	    this.setLocation(xpos, ypos);
	    this.setResizable(false);
	    this.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {  //
		for(int i=0;i<bt.length;i++) {
			if(e.getSource()==bt[i]) {
			   list.add(food[i]);
			   int res=0;
			   ta.setText(str+"\n");
			   for(Food f:list) { 
				   ta.append(f.getName()+"\t"+f.getPrice()+"\n");
				  res+=f.getPrice();
			   }
			   ta.append("----------\n");
			   ta.append("합계 : "+res+"원");
			}
		}
		
		
	}
	
}

public class GUIExampleTest_08 {

	public static void main(String[] args) {
		MyFrame09 frame = new MyFrame09("frame예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
