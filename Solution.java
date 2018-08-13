import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int charge = sc.nextInt();
		int withdrawalamount = sc.nextInt();
		
		int tempamount = 0;
		int count =0;
		
		while(amount>tempamount&&(tempamount+withdrawalamount+charge)<=amount)
		{
		    tempamount = tempamount+withdrawalamount+charge;
		    count++;
		}
		
		System.out.println(count);

	}
}
