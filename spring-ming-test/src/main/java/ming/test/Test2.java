package ming.test;

import ming.inface.A;
import ming.inface.B;
import ming.service.TestInterfaceImpl;

/**
 * @ClassName: Test2
 * @Author: lsm
 * @Description:
 * @Date: 2019/10/23 15:52
 * @Version: 1.0
 */
public class Test2 {

	public static void main(String[] args) {
		TestInterfaceImpl testInterface = new TestInterfaceImpl();
		if (testInterface instanceof A){
			System.out.println("我是A类型");
		}else if (testInterface instanceof B){
			System.out.println("我是B类型");
		}else {
			System.out.println("我是其他类型");
		}
		System.out.println(testInterface instanceof B);
	}
}
