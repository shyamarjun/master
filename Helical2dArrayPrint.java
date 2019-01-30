
import java.util.Arrays;

public class PrintHelicalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 5;
		int cols = 2;
		int[][] my2darray = new int[rows][cols];
//		int [] my1darray = {1,3,6,4,9,8};
		for (int i =0; i<rows;i++) {
			for (int j=0; j<rows; j++) {
				my2darray[i][j] = j+1;
			}
		}
		
		System.out.println("array is : ");
		
		for (int i =0; i<rows;i++) {
			for (int j=0; j<rows; j++) {
				System.out.print(my2darray[i][j] +" ");
			}
		System.out.println();
		}

		// count_max = total count of elements.
		// count_now = counter as trasversed.
		// row_max = max row value index
		// col_max = max col value index

		int count_max = rows * cols;
		int count_now =0;
		int row_max = rows;
		int col_max = cols;
		int init_row =0;
		int init_col =0;
		
		int r,c ;
		r=0;
		c=0;
//		System.out.println("init_row = " + init_row +
//				" init_col = " + init_col +
//				" row_max = " + row_max +
//				" col_max = " + col_max);
//		
		while(count_now < count_max) {
			
			for(c= init_col; c< col_max; c++) {
				System.out.print(my2darray[r][c] + " ");
				count_now++;
			}
			c = c-1;
			//System.out.println("c is :" + c + "count_now is :" + count_now);
			if (count_now < count_max) {
				for (r = init_row+1; r< row_max; r++) {
					System.out.print(my2darray[r][c] + " ");
					count_now++;
				}
				r = r-1;
				//System.out.println("r is :" + r + "count_now is :" + count_now);
			}else {
				break;
			}
			
			if (count_now < count_max) {
				for (c = c-1; c>= init_col; c--) {
					System.out.print(my2darray[r][c] + " ");
					count_now++;
				}
				c = c+1;
				//System.out.println("r is :" + r + "count_now is :" + count_now);
			}else {
				break;
			}
			
			if (count_now < count_max) {
				for (r = r-1; r> init_row; r--) {
					System.out.print(my2darray[r][c] + " ");
					count_now++;
				}
				c = r+1;
				//System.out.println("r is :" + r + "count_now is :" + count_now);
			}else {
				break;
			}
			
			init_row = init_row +1;
			init_col = init_col +1;
			row_max = row_max -1;
			col_max = col_max -1;
			
//			System.out.println();	
//			System.out.println("init_row = " + init_row +
//					" init_col = " + init_col +
//					" row_max = " + row_max +
//					" col_max = " + col_max);
//			
	}
			
			
	}

}
