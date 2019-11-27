package maytinhcanhan.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import maytinhcanhan.MaytinhcanhanImpl;
import maytinhcanhanimpl.MayTinhCaNhan;

public class MethotTest {
	MaytinhcanhanImpl maytinhcanhan = new MayTinhCaNhan();
	@Test
	public void testMaytinhcanhan() {
		Object[] result = maytinhcanhan.maytinhcanhan(1, 0);
		System.out.println("Cong = "+result[0]);
		System.out.println("Tru = "+result[1]);
		System.out.println("Nhan = "+result[2]);
		System.out.println("Chia không thập phân = "+result[3]);
		System.out.println("Chia thập phân = "+result[4]);
		System.out.println("Chia lấy phần dư = "+result[5]);
	}
}
