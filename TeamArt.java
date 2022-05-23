package step06.teamart;

import org.junit.Test;

class Parent {
	//이름
	String [] a = {"김진원","임주완","이동규"};
	
	Parent(){
		super();
	}
	
			
			
}



public class TeamArt extends Parent{
	
	int [] age = {30,30,29};
	
	static Object[] getDatas(){
		// new Child5() 생성 시 no와 no2 = 100과 200으로 초기화 
		Object [] o = {"Playdata",new TeamArt()};		
		return o;
		
		
	}
	
	public TeamArt() {
		super();
	}
	
	
	
	
	static void printDatas(Object[] v){
		
		
		TeamArt [] v1 = (TeamArt[]) v;
		System.out.println(v[0] + " " + (v1[0].age[0])); 
		
	}
	
	
	static Object[] changeDatas(Object[] v){
		//? parameter로 유입된 v[0] 의 데이터에 Encore추가 - EncoreString으로 가공
		//? 
		v[0] = "Encore" + v[0];
		return v;
		
	}
	
	
	public static void main(String[] args) {
		
		printDatas((getDatas()));

	}

}
