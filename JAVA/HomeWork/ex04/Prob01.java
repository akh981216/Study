import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int number = 0;
		int count = 0;
		int sum = 0;

		System.out.println("���� ������ �Է����ּ���:");
		number = stdIn.nextInt();

		for (int i = 0; i <=1000; i += number) {
			count++;
			sum += i;
		}

		System.out.println(number + "�� ��� ����=" + count);
		System.out.println(number + "�� ��� ��=" + sum);
	}
}