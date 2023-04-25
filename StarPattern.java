package SDET;

import org.junit.Test;

	public class StarPattern {
		
		
		@Test
		public void input() {
			int n=7;
			test(n);
		}
		private void test(int n) {
			// TODO Auto-generated method stub
			
			
			for(int i=1;i<=n;i++) { 
				
				for(int s=n;s>=i;s--) {
					System.out.print(" ");
				} 
				
				for(int j=1;j<=i;j++) {
					System.out.print(" *");
				}
				
				System.out.println();
			}

		}

	}
	                    


