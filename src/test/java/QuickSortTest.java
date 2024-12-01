import static org.junit.Assert.assertArrayEquals; 
import org.junit.Test; 

public class QuickSortTest { 
	
	@Test 
	public void testQuickSort_emptyArray() {  
		int arr = {}; 
		QuickSort.quickSort(arr, 0, arr.length - 1); 
		assertArrayEquals(new int[]{}, arr); 
		
	} 
	
	
	
	
}