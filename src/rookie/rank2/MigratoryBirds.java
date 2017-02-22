package rookie.rank2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {
	enum Birds{
		TYPE_1(1),
		TYPE_2(2),
		TYPE_3(3),
		TYPE_4(4),
		TYPE_5(5);

		private Birds(int type){
			this.type = type;
		}
		private int type;
		private static Map<Integer,Birds> map = new HashMap<>();
		static {
			for (Birds bird : Birds.values()) {
				map.put(bird.type, bird);
			}
		}
		public int getType() {
			return type;
		}
		public static Birds valueOf(int type) {
			return map.get(type);
		}


	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		for(int arr_i=0; arr_i < n; arr_i++){
			types[arr_i] = in.nextInt();
		}
		int[] frequencies = new int[6]; //A
		for (int i = 0; i < types.length; i++) { //B
			frequencies[types[i]] += 1; //C
		}
		int mostCommon = 0;
		for (int i = 1; i < frequencies.length; i++) { //D
			if (frequencies[mostCommon] < frequencies[i]) {
				mostCommon = i; //E
			}
		}
		System.out.println(mostCommon);
	}

private static int highestFrequency(int[] types) {
	int type_1_count = 0;
	int type_2_count = 0;
	int type_3_count = 0;
	int type_4_count = 0;
	int type_5_count = 0;

	for(int index=0; index<types.length;index++){
		Birds bird_type = Birds.valueOf(types[index]);
		switch(bird_type){
		case TYPE_1:{
			type_1_count++;
			break;
		}
		case TYPE_2:{
			type_2_count++;
			break;
		}
		case TYPE_3:{
			type_3_count++;
			break;
		}
		case TYPE_4:{
			type_4_count++;
			break;
		}
		case TYPE_5:{
			type_5_count++;
			break;
		}
		}
	}
	int maxCount = type_1_count;
	maxCount = maxCount>type_2_count?maxCount:type_2_count;
	maxCount = maxCount>type_3_count?maxCount:type_3_count;
	maxCount = maxCount>type_4_count?maxCount:type_4_count;
	maxCount = maxCount>type_5_count?maxCount:type_5_count;
	if(maxCount == type_1_count){

	}else if(maxCount == type_1_count){
		return Birds.TYPE_1.getType();
	}else if(maxCount == type_2_count){
		return Birds.TYPE_2.getType();
	}else if(maxCount == type_3_count){
		return Birds.TYPE_3.getType();
	}else if(maxCount == type_4_count){
		return Birds.TYPE_4.getType();
	}else if(maxCount == type_5_count){
		return Birds.TYPE_5.getType();
	}
	return maxCount;
}

}

