
public class TasksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ExOh('xoxoox'): " + ExOh("xoxoox"));
		System.out.println("ExOh('oooxoo'): " + ExOh("oooxoo") + " \n");
		
		System.out.println("ABCheck('Laura sobs'): " + ABCheck("Laura sobs") + "\n");
		
		System.out.println(dashInsert(99946));
		System.out.println(dashInsert(56730));
		System.out.println(dashInsert(999999099));

	}
	
	static boolean ExOh(String input){
		int oCount = 0,
			xCount = 0;
		
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'o':
				oCount++;
				break;
			case 'x':
				xCount++;
				break;
			default:
				break;
			}
		}
		
		return oCount == xCount ? true : false;
	}
	
	static boolean ABCheck(String input){
		boolean result = false;
		int lastAIndex = 0,
			lastBIndex = 0;
		
		while((lastAIndex = input.indexOf('a', lastAIndex)) != -1 
				&& !result){
			
			while((lastBIndex = input.indexOf('b', lastBIndex)) != -1
					&& !result){
				int indexDifference = Math.abs(lastAIndex - lastBIndex) - 1;
				
				if(indexDifference == 3){
					result = true;
				}
				
				lastBIndex++;
			}
			
			lastAIndex++;
		}
		
		
		return result;
	}

	static String dashInsert(int num){
		StringBuilder sb = new StringBuilder(Integer.toString(num));
		
		for (int i = 0; i < (sb.length() - 1); i++) {
			//As the chars are equal odd on ansii I will use the same method
			if((sb.charAt(i) % 2 == 1) && (sb.charAt(i + 1) % 2 == 1)){
				sb.insert(++i, '-');
			}
		}
		
		return sb.toString();
	}
}
