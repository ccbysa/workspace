import java.util.*;

public class Days {
	public static void main(String[] args) {
		int day = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = sc.nextInt();
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		
		case 2:
			if ((year%4==0) && (year%100!=0) ||(year%4==0) ) {
				day = 29;
			}
			else {
				day = 28;
			}
			break;
			
		default:
			System.out.println("月份输入错误");
			sc.close();
			System.exit(-1);
			break;
		}
		
		System.out.printf("公元%d年%2d月有%2d天：", year, month, day);
		sc.close();
	}
}
