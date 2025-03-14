import java.util.HashMap;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		System.out.println("==============Library Management=============");
		HashMap<String,String>map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("OPtions:");
			System.out.println("1)Add Book With Author name ");
			System.out.println("2)Barrow Book");
			System.out.println("3)Return Book");
			System.out.println("4)Display the details of Books");
			System.out.println("5)Exit");
			System.out.println("Choice:1/2/3/4/5 ");
			
		int n=sc.nextInt();
		sc.nextLine();
		switch(n)
		{
		case 1:
			
			System.out.println("Enter the Book name and Author name:");
			System.out.println("Enter Book Name:");
			String Bname=sc.nextLine();
			System.out.println("Enter Author Name:");
			String Aname=sc.nextLine();
			if(map.containsKey(Bname))
			{
				System.out.println("The Book is already Existed!!!!");
			}
			map.put(Bname, Aname);
			System.out.println("=> Book "+Bname+" by Author "+Aname+" is added Successfuly!!!!!!");
			System.out.println();
			break;
		case 2:
			System.out.println("enter the Book Name you want to Barrow:");
			String RBname=sc.nextLine();
			if(map.isEmpty())
			{
				System.out.println("The library is empty!!!!!");
			}
			if(map.remove(RBname)!=null)
			{
				System.out.println("=> Book "+RBname+" is Barrowed.");
				System.out.println();
			}
			break;
		case 3:
			System.out.println("enter the Book you want to Return");
			String RBook=sc.nextLine();
			System.out.println("enter the Author Name");
			String AName1=sc.nextLine();
			if(map.containsKey(RBook))
			{
				System.out.println("=> The Book is not Borrowed From the Library");
			}
			else {
			map.put(RBook, AName1);
			System.out.println("=> The Book is returned SuccessFully");
			System.out.println();
			}
			break;
		case 4:
			System.out.println("Details of Books in The Library");
			System.out.println();
			map.forEach((k,v)->System.out.println(k+" : "+v));
			break;
		case 5:
			System.out.println("=> You Entered the Exit Button!!!!!!!!!");
			System.exit(0);
			break;
			default :
				System.out.println("Inavalid Input");
			}
	   }
	
   }
}