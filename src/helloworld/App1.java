package helloworld;
//sysout + ctrl+spacebar
//convert to uppercaase : select text and press ctr+shift+x
//convert to lowercaase : select text and press ctr+shift+y

class App3
{
	int n=0;
}

class App2 extends App3{
	int a=10;
	void dispaly()
	{
		System.out.println("hiuuuuiii");
	}
}
public class App1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App2 obj = new App2();
		System.out.println(obj.a);
		obj.dispaly();
		System.out.println(obj.n);

	}

}
