package overriding;

public class main {

	public static void main(String[] args) {
		// Lesson 39
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {new OgretmenKrediManager(),new TarımKrediManager(),new OgrenciKrediManager() };
		
		for (BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	

	}

}
