package maytinhcanhanimpl;

import maytinhcanhan.MaytinhcanhanImpl;

public class MayTinhCaNhan implements MaytinhcanhanImpl {
	public Object[] maytinhcanhan(int number1, int number2) {
		// Khai báo Biến
		Integer chia2So = null;
		Float chia2SoLayThapphan = null;
		Integer chia2soLayPhandu = null;
	
		// 1. Cộng 2 số
		Integer cong2So = number1 + number2;
		// 2. Trừ 2 số
		Integer tru2So = number1 - number2;
		// 3. Nhân 2 số
		Integer nhan2So = number1 * number2;
		
		try {
			if(number2 == 0) {
				chia2So = 0;
				chia2SoLayThapphan = (float) 0;
				chia2soLayPhandu = 0;
			}
			// 4. Chia 2 số không có số thập phân
			chia2So = (int) number1/number2;
			// 5. Chia 2 số có lấy số thập phân
			chia2SoLayThapphan = (float) number1/number2;
			// 6. Chia 2 số có lấy phân dư
			chia2soLayPhandu = number1%number2;
		} catch (Exception e) {
			System.err.println("Bạn chọn số thứ 2 sai. Nhờ bạn nhập lại giúp mình khác không");
		}
		
		return new Object[] {cong2So, tru2So, nhan2So, chia2So, chia2SoLayThapphan, chia2soLayPhandu};
	}
}
