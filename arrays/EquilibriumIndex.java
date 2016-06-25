package arrays;

public class EquilibriumIndex {
	
	public void equilibrium(){
		int a[]=new int[]{-7, 1, 5, 2, -4,3,0};
		
		int i=0, j=0;
		
		for(int k=0; k<a.length; k++)
			j=j+a[k];
		
		for(int k=0; k<a.length; k++){
			j=j-a[k];
			
			if(i==j)
				System.out.println(k);
			
			i=i+a[k];
		}
		
	}
	
	public static void main(String args[]){
		EquilibriumIndex equilibriumIndex=new EquilibriumIndex();
		equilibriumIndex.equilibrium();
		
		String s1="hello";
		String s2="hello";
		System.out.println(s1+"  "+s2);
		
		
		 s1="world";
			System.out.println(s1+"  "+s2);
			
		String s3=new String("name");
		String s4=new String(s3);
		
		System.out.println(s3+"  "+s4);
		
		 s3=new String("rahul");
		
		System.out.println(s3+"  "+s4);
	}
}
