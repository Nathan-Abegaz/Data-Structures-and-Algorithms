//*
  * Test class that checks uses JUnit Tests to check the experient with various input
  *
//

import static org.junit.Assert.*;

import org.junit.Test;

public class KadaneJUnits {

	@Test
	public void test() {
		KadaneAlgorithm test = new KadaneAlgorithm();
		
		int[] input1 = {22,-27, 38, -34, 49, 40, 13, -44, -13, 28, 46, 7, -26,
						42, 29, 0, -6, 35, 23, -37, 10, 12, -2, 18, -12, -49,
						-10, 37, -5, 17, 6, -11, -22, -17, -50, -40, 44, 14, 
						-41,19, -15, 45, -23, 48, -1, -39, -46, 15, 3, -32, -29,
						-48,-19, 27, -33, -8, 11, 21, -43, 24, 5, 34, -36, -9,
						16, -31, -7, -24, -47, -14, -16, -18, 39, -30, 33, -45, 
						-38, 41, -3, 4, -25, 20, -35, 32, 26, 47, 2, -4, 8, 9, 31,
						-28, 36, 1, -21, 30, 43, 25, -20, -42};
		
		int[] input2 = {-18, -47, -40, -43, -2, 48, 31, -24, 36, -49,
						4, -29, -4, -39, 12, 24, 8, 40, 45, -17, 6, -11,
						-5, -30, -8, 25, -44, -9, -20, -50, -12, -32, 41,
						10, -42, -15, 11, -38, 37, 21, 33, -22, 16, -41,
						-46, -33, -26, 7, -3, -28, 29, 20, 27, 3, 15, 49,
						23, -1, 14, 32, -31, -13, -48, -14, 13, 39, 46, -35,
						-36, 0, 17, -27, -21, 28, -7, 44, -10, 34, -19, 47,
						42, -34, 5, 26, -45, 35, 9, -25, 38, -37, -23, 22,
						-6, -16, 18, 43, 30, 2, 19, 1};
		
		int[] input3 = {3, 35, -45, 12, 44, 6, 46, -33, -15, 39, -19, 19, 
						-31, -41, -35, 23, -25, 42, 2, 22, 40, -40, -24, 
						38, 14, 10, -44, 31, 16, 48, 29, 20, 32, -13, 43,
						-49, -10, 21, 28, 49, -28, -36, 36, -21, -26, 15,
						25, -34, -20, -42, -43, 33, 1, -39, 45, 18, 27, 
						-12, -22, -1, 47, -17, -4, 41, -32, -2, -5, -48, 
						-7, 37, 8, -3, 26, -27, -6, 7, -47, -8, 11, -46,
						9, -23, 4, -30, -9, -18, -29, 17, -11, 30, -50,
						-14, 24, 5, 34, 0, 13, -37, -16, -38};
		
		int[] input4 = {-43, 15, -6, 14, 18, -22, -26, -5, 26, 17, -21,
						-12, -35, 41, 45, -3, 3, -25, 1, 30, -11, -30, 
						-27, -1, 48, 44, -40, 32, -23, 29, 12, -20, -48,
						42, -16, -36, -49, 43, -28, 21, 33, -44, -9, 38,
						31, 35, -34, -24, -41, 7, -14, -46, -29, 23, -47,
						9, -45, -37, -38, -10, 20, 5, 2, 39, 34, 46, -7,
						13, -15, 11, -32, 37, -50, -8, 36, -17, -2, 4, 8,
						-13, 19, 16, 27, -31, -18, -39, 49, -42, 10, 28,
						22, 47, -4, 0, 24, 40, -19, 25, 6, -33};
		
		int[] input5 = {15, -42, 40, -33, -47, 13, -27, 1, -39, -41, 11,
						33, 4, -18, -44, 43, 39, -20, -23, 5, 12, 19, -12,
						46, -19, -2, 35, -16, -45, -14, 16, -35, -24, -15,
						2, -30, -13, 24, -50, 7, -10, 0, -4, 6, 42, 9, -31,
						-34, -1, 21, 36, -7, -36, -17, 32, 10, -32, 48, 18,
						-43, 31, 30, 25, 23, -29, -40, 45, -3, 41, 17, -46,
						-5, 34, 49, 3, 37, 14, 22, -38, -49, -37, -22, 47, 27,
						-11, 29, -48, -26, 38, -21, -25, -9, 20, 8, 44, 26, -8,
						-6, -28, 28};
				
		int[] input11 = {-3, -4, -5, -6, -7};
		
		assertEquals(0,test.findMaxSubArray(input11));
		assertEquals(-1,test.arrive);
		assertEquals(0,test.depart);
		
		assertEquals(239,test.findMaxSubArray(input1));
		assertEquals(77,test.arrive);
		assertEquals(97,test.depart);
		
		assertEquals(322,test.findMaxSubArray(input2));
		assertEquals(50,test.arrive);
		assertEquals(99,test.depart);
		

		
		//assertEquals(305, test.findMaxSubArray(input3));
		//assertEquals(77,test.arrive);
		//assertEquals(97,test.depart);
		
		//assertEquals(271,test.findMaxSubArray(input4));
//		assertEquals(60,test.arrive);
//		assertEquals(98,test.depart);
		
//		assertEquals(281,test.findMaxSubArray(input5));
//		assertEquals(54,test.arrive);
//		assertEquals(77,test.depart);



		
	}

}
