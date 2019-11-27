package maytinhcanhantest;

import java.util.Scanner;

import maytinhcanhan.MaytinhcanhanImpl;
import maytinhcanhanimpl.MayTinhCaNhan;

public class MaytinhcanhanTest {

	private static Integer number1;
	private static Integer number2;
	private static Integer chon;
	
	public static void caseToanTu() {
		MaytinhcanhanImpl mayTinhCaNhan = new MayTinhCaNhan();
		Object [] result = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("===============MENU===========================");
		System.out.println("1. Tính tổng 2 số: ");
		System.out.println("2. Tính trừ 2 số: ");
		System.out.println("3. Tính nhân 2 số: ");
		System.out.println("4. Tính chia 2 số không thập phân: ");
		System.out.println("5. Tính chia 2 số có thập phân: ");
		System.out.println("6. Tính chia 2 số lấy số dư: ");
		System.out.println("7. Mời bạn thoát e: ");
		System.out.println("");
		System.out.print("Mời bạn chon menu thứ từ 1 đến 7: ");
		try {
			chon = scanner.nextInt();
			if(chon ==1 || chon ==2 || chon ==3 || chon ==4 || chon ==5 || chon ==6) {

				System.out.print("Mời bạn nhập số thứ 1: ");
				number1 = scanner.nextInt();
				System.out.print("Mời bạn nhập số thứ 2: ");
				number2 = scanner.nextInt();
				result = mayTinhCaNhan.maytinhcanhan(number1, number2);
			} else if(chon == 7) {
				System.out.println("===============================================");
				System.out.println("");
				System.out.println("");
				System.out.println("Cảm ơn đã dùng chương trình. Bye bye");
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Bạn nhập sai. Bạn nhập số nguyên giúp mình");
		}
		switch (chon) {
		case 1:
			System.out.println("===============================================");
			System.out.println("result = " + result[0]);
			break;
		case 2:
			System.out.println("===============================================");
			System.out.println("result = " + result[1]);
			break;
		case 3:
			System.out.println("===============================================");
			System.out.println("result = " + result[2]);
			break;
		case 4:
			System.out.println("===============================================");
			System.out.println("result = " + result[3]);
			break;
		case 5:
			System.out.println("===============================================");
			System.out.println("result = " + result[4]);
			break;
		case 6:
			System.out.println("===============================================");
			System.out.println("result = " + result[5]);
			break;
		default:
			System.out.println("Bạn nhập sai nhập lại đúng menu giúp mình nhé.");
			break;
		}
	}

	public static void main(String[] args) {
		while (true) {
			caseToanTu();
		}
	}

}
