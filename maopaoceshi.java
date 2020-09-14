package maopao;

import static org.junit.Assert.*;

import org.junit.Test;

public class maopaoceshi {

	@Test
	public void test() {
		//fail("Not yet implemented");
		 int a[] = { 6, 18, 333, 7, 2, 4, 444, 999, 687 };

		  int i, j, n, temp;

		  n = a.length;

		  for (j = 0; j < n; j++) {

		  for (i = 0; i < n - j; i++) {

		  try {

		  if (a[i] > a[i + 1]) {

		  temp = a[i];

		  a[i] = a[i + 1];

		  a[i + 1] = temp;

		  }

		  } catch (Exception e) {

		  }

		  }

		  }

		  for (i = 0; i < n; i++) {

		  System.out.print(a[i] + " ");

		  }
		  System.out.println();
		  
		  int a1[] = { 61, 128, 3333, 7, 22, 4, 4434, 9949, 687 };

		  int i1, j1, n1, temp1;

		  n1 = a1.length;

		  for (j1 = 0; j1 < n1; j1++) {

		  for (i1 = 0; i1 < n1 - j1; i1++) {

		  try {

		  if (a1[i1] > a1[i1 + 1]) {

		  temp1 = a1[i1];

		  a1[i1] = a1[i1 + 1];

		  a1[i1+ 1] = temp1;

		  }

		  } catch (Exception e) {

		  }

		  }

		  }

		  for (i1 = 0; i1 < n1; i1++) {

		  System.out.print(a1[i1] + " ");

		  }
		  System.out.println();
		  int a2[] = { 31, 128, 3133, 72, 25, 14, 444, 99, 6827 };

		  int i2, j2, n2, temp2;

		  n2 = a2.length;

		  for (j2 = 0; j2 < n2; j2++) {

		  for (i2 = 0; i2 < n2 - j2; i2++) {

		  try {

		  if (a2[i2] > a2[i2 + 1]) {

		  temp2 = a2[i2];

		  a2[i2] = a2[i2 + 1];

		  a2[i2+ 1] = temp2;

		  }

		  } catch (Exception e) {

		  }

		  }

		  }

		  for (i2 = 0; i2 < n2; i2++) {

		  System.out.print(a2[i2] + " ");

		  }
		  
	}

}
