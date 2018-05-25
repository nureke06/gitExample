import java.util.*;
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
		String str = scan.next()+"l";
		char [] arr = str.toCharArray();
		char [] glas = {'a','e','i','o','u','y'};
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<n;i++){
			if(arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' ||
				arr[i]=='u' || arr[i]=='o' || arr[i]=='y'){
					if(arr[i+1]=='a' || arr[i+1]=='e'|| arr[i+1]=='i' ||
						arr[i+1]=='u' || arr[i+1]=='o' || arr[i+1]=='y'){
						list.add(arr[i]);
						i++;
					}else list.add(arr[i]);
				
			}else list.add(arr[i]);
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"");
			System.out.println();
			//new1
		}
		
    }
}