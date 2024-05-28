package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.Bao;
import advance.dev.model.IManager;
import advance.dev.model.Sach;
import advance.dev.model.TapChi;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        IManager manager = new Manager();

		        // Thêm tài liệu
		        manager.add(new Sach("S001", "NXB Tre", 100, "Tac Gia A", 300));
		        manager.add(new TapChi("T001", "NXB Giao Duc", 200, 1, 5));
		        manager.add(new Bao("S003", "Thang", 4, 30));

		        // In danh sách tài liệu
		        System.out.println("Danh sách tài liệu:");
		        manager.print();

		        // Sắp xếp tên tăng dần
		        manager.sortByName(1);
		        System.out.println("\nDanh sách tài liệu sau khi sắp xếp tên tăng dần:");
		        manager.print();

		        // Sắp xếp tên giảm dần
		        manager.sortByName(-1);
		        System.out.println("\nDanh sách tài liệu sau khi sắp xếp tên giảm dần:");
		        manager.print();
		    
		
	}

}
