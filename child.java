package Assignments;

public class child extends parent {
	public static void main (String [] args) 
    {
        Thread t = new Main()
        {
            public void run() 
            {
                System.out.println(" 1");
            }
        };
        t.start();
    }

}
