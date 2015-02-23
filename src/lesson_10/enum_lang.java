package lesson_10;

import javax.swing.JOptionPane;

public class enum_lang {

	public static void main(String[] args) {
		
		int [] m = {};
		System.out.println(m.getClass().getName());
		
		System.out.println(cityInfo(City.KYIV));
		System.out.println(cityInfo(City.LONDON));
		System.out.println(cityInfo(City.PARIS));
		
		System.out.println(isValidPref(36));
		System.out.println(isValidPref(44));
		System.out.println(isValidCity("KYIV"));
		System.out.println(isValidCity("Paris"));
		
		System.out.println(getYes(Lang.FR));
		if(JOptionPane.showConfirmDialog(null, getExit(Lang.FR) + "?")==JOptionPane.OK_OPTION)
			return;
		System.out.println("app is working still!");
	}
	
	static String cityInfo(City city){
		return "Our office in " + city.toString() + " phone prefix: " + String.format("%03d", city.getCode());
	} 
	static boolean isValidPref(int p){
		City [] ct = City.values();	// передаем в массив все данные из енум
		for (City t : ct) {
			if(p==t.getCode())
				return true;
			
		}
		return false;
	}
	static boolean isValidCity(String cityName){
		City [] cs = City.values();
		for (City t : cs) {
			if(t.toString().toLowerCase().equals(cityName.toLowerCase()))
				return true;
		}
		return false;
	}
	enum City {
		KYIV(44),LONDON(2),PARIS(1);

		private int code;
		private City (int c) {code = c;}
		public int getCode(){
			return code;
		}
	}

	enum Lang {EN,UA,FR};
	static String getYes(Lang l){
		String[]m={"Yes","Так","Oui"};
		return m[l.ordinal()];
	}
	static String getExit(Lang l){
		String[]m={"Exit","Вийти","Quitter"};
		return m[l.ordinal()];
	}
}
