package sample.testcase;

public class Test {
	public static void main(String[] args) {
		int a[] = { 10, 100, 90, 20, 40 }, temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
