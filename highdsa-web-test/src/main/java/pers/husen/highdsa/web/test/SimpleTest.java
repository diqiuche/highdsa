package pers.husen.highdsa.web.test;

/**
 * @Desc Java代码测试
 *
 * @Author 何明胜
 *
 * @Created at 2018年2月5日 下午2:31:01
 * 
 * @Version 1.0.0
 */
public class SimpleTest {
	public static void splitTest() {
		String string = "husen@hemingsheng.cn";

		String[] result = string.trim().split(",|，");

		for (String str : result) {
			System.out.println(str);
		}

		String string2 = " ";
		System.out.println(string2 == " ");
	}

	public static void methodNameGet() {
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		System.out.println(method);
	}
	public static void main(String[] args) {
		methodNameGet();
	}
}