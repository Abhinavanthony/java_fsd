package CameraRental;

import java.util.ArrayList;
import java.util.Scanner;

class Data {
	
	private int camera_id;
	private String model;
	private double price;
	private boolean status;
	private String brand;
	
	Data(int camera_id, String brand, String model, double price, boolean Available)
	{
		
		this.camera_id = camera_id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = Available;
		
	}
	
	public int getId(){
		return camera_id;
		}
	
	public String getBrand(){
	return brand;
	}
	
	public String getModel() {
		return model;
		}
	
	public double getPrice(){
		return price;
		}
		public boolean isAvailable(){
		return status;
		}
		public void setAvailable(boolean Available){
		this.status = Available;
		}
}

		public class CameraRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("+------------------------------------+");
		System.out.println("|  Welcome To The Camera Rental App  |");
		System.out.println("+------------------------------------+");
		
		double INR = 1000;
		String username, password;
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER USERNAME:");// username:user
		username = s.nextLine();
		System.out.print("ENTER PASSWORD:");// password:user
		password = s.nextLine();
		if (username.equals("Abhinav") && password.equals("Abhinav@86")) {
		System.out.println("******");
		System.out.println(" LOGIN SUCCESSFUL");
		System.out.println("******\n");
		int ID = 1;
		
		ArrayList<Data> list = new ArrayList<>();
		list.add(new Data(ID++, "Canon", "DSLR", 1000, true));
		list.add(new Data(ID++, "Sony", "Ds123", 500, false));
		list.add(new Data(ID++, "LG", "5050", 280, true));
		list.add(new Data(ID++, "Lenova", "XPL", 300, true));
		list.add(new Data(ID++, "Nikon", "SRL", 350, true));
		list.add(new Data(ID++, "Sony", "2130", 260, false));
		list.add(new Data(ID++, "Samsung", "DL", 550, true));
		list.add(new Data(ID++, "LG", "Digital", 120, true));
		// int l=list.size();
		
		int x = 0;
		do {
		int option;
		Scanner sc = new Scanner(System.in);
		
		// public void main_option()
		System.out.println(" MENU");
		System.out.println("*****");
		System.out.println("1.MY CAMERA");
		System.out.println("2.RENT A CAMERA");
		System.out.println("3.VIEW ALL CAMERA");
		System.out.println("4.MY WALLET");
		System.out.println("5.EXIT");
		System.out.println("Select your option : ");
		option = sc.nextInt();
		switch (option) {
		case 1:
		int k = 0;
		
		do {
			int choose;
			System.out.println(" MY CAMERA");
			System.out.println("*****");
			System.out.println("1.ADD");
			System.out.println("2.REMOVE");
			System.out.println("3.VIEW MY CAMERA");
			System.out.println("4.GO TO PREVIOUS MENU");
			System.out.println("ENTER YOUR CHOISE : ");
			choose = sc.nextInt();
			
			switch (choose) {
			case 1:
			int camera_id = ID++;
			System.out.println("ENTER CAMERA BRAND: ");
			String brand = sc.next();
			System.out.println("ENTER CAMERA MODEL: ");
			String model = sc.next();
			System.out.println("ENTER CAMERA PRICE PER DAY: ");
			double price = sc.nextFloat();
			boolean Available = true;
			list.add(new Data(camera_id, brand, model, price, Available));
			System.out.println("SUCCESSFULLY ADDED\n");
			System.out.println("********\n");
			System.out.println("YOU WANT VIEW CAMERA LIST (1.YES 2.NO)- ");
			int m = sc.nextInt();
			if (m == 1) 
			{
				
				System.out.println("==================================================");
				System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
				System.out.println("==================================================");
				for (int i = 0; i < list.size(); i++) {
				Data data = list.get(i);
				String status = data.isAvailable() ? "Available" : "Rended";
				System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()
				+ "\t" + data.getPrice() + "\t" + status);
				}
				
				System.out.println("==================================================");
			}
			
			System.out.println("\nIF YOU WANT GO AGAIN MY CAMERA (1.YES 2.NO)- :");
			k = sc.nextInt();
			break;
			
			case 2:
				System.out.println("WHICH ONE YOU WANT TO REMOVE 'ENTRE CAMERA ID': ");
				int cameraId = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
				Data camera = list.get(i);
				if (camera.getId() == cameraId) {
				list.remove(i);
				System.out.println("REMOVED SUCCESSFULLY");
				System.out.println("********\n");
				break;
				
				}
				
				}
				
				System.out.println("YOU WANT VIEW CAMERA LIST (1.YES 2.NO)-: ");
				int l = sc.nextInt();
				if (l == 1) {
				System.out.println("==================================================");
				System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
				System.out.println("==================================================");
				for (int i = 0; i < list.size(); i++) {
				Data data = list.get(i);
				String status = data.isAvailable() ? "Available" : "Rended";
				System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()
				+ "\t" + data.getPrice() + "\t" + status);
				}
				
				System.out.println("==================================================");
				}
				System.out.println("\nIF YOU WANT GO AGAIN MY CAMERA (1.YES 2.NO)- :");
				k = sc.nextInt();
				break;
				
			case 3:
				System.out.println("==================================================");
				System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
				System.out.println("==================================================");
				for (int i = 0; i < list.size(); i++) {
				Data data = list.get(i);
				String status = data.isAvailable() ? "Available" : "Rended";
				System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel()
				+ "\t" + data.getPrice() + "\t" + status);
				}
				System.out.println("==================================================");
				System.out.println("\nIF YOU WANT GO AGAIN MY CAMERA (1.YES 2.NO)- :");
				k = sc.nextInt();
				break;
				
			case 4:
				x = 1;
				k = 2;
				break;
				}
				} while (k == 1);
				break;
				
		case 2:
			System.out.println("==================================================");
			System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
			System.out.println("==================================================");
			for (Data data : list) {
			if (data.isAvailable()) {
			String status = data.isAvailable() ? "Available" : "Rended";
			System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel() + "\t"
			+ data.getPrice() + "\t" + status);
			}
			}
			
			System.out.println("==================================================");
			int index = -1;
			System.out.println("\nWHICH ONE YOU WANT TO RENT 'ENTRE CAMERA ID': ");
			int cameraId = sc.nextInt();
			for (int i = 0; i < list.size(); i++) {
			Data camera = list.get(i);
			if (camera.getId() == cameraId) {
			index = i;
			break; // Found the camera, exit the loop
			}
			}
			
			if (index != -1) {
				Data a = list.get(index);
				if (a.getPrice() <= INR) {
				System.out.println("RENDED SUCCESSFULLY\n");
				a.setAvailable(false);
				INR = INR - a.getPrice();
				System.out.println("CURRENT WALLET BALANCE - " + INR);
				} else {
				System.out.println("YOU DON'T HAVE SUFFICIENT BALANCE IN YOUR WALLET");
				}
				} else {
				System.out.println("CAMERA WITH ID " + cameraId + " IS NOT FOUND IN THE LIST.");
				}
				System.out.println("\nIF YOU WANT GO MENU (1.YES 2.NO)- ");
				x = sc.nextInt();
				break;
				
		case 3:
			System.out.println("==================================================");
			System.out.println("CAMERA_ID\t| BRAND\t| MODEL\t| PRICE\t| STATUS |");
			System.out.println("==================================================");
			for (int i = 0; i < list.size(); i++) {
			Data data = list.get(i);
			String status = data.isAvailable() ? "Available" : "Rended";
			System.out.println(data.getId() + "\t\t" + data.getBrand() + "\t" + data.getModel() + "\t"
			+ data.getPrice() + "\t" + status);
			}
			System.out.println("==================================================");
			System.out.println("\nIF YOU WANT GO MENU (1.YES 2.NO)- ");
			x = sc.nextInt();
			break;
			
		case 4:
			System.out.println("YOUR CURRENT WALLET BALANCE IS :" + INR);
			System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO)- ");
			int m = sc.nextInt();
			if (m == 1) {
			System.out.println("\nENTER DEPOSIT AMOUNT: ");
			double addAmount = sc.nextDouble();
			INR = INR + addAmount;
			System.out.print("YOUR WALLET BALANCE UPDATED SUCCESSFULLY...");
			}
			System.out.println("CURRENT WALLET BALANCE - " + INR);
			System.out.println("\nIF YOU WANT TO GO MENU (1.YES 2.NO)- ");
			x = sc.nextInt();
			break;
			
		case 5:
			x = 2;
			break;
			default:
			System.out.println("INVALID INPUT");
			break;
			}
			} while (x == 1);
			} else {
			System.out.println("*********");
			System.out.println(" AUTHENTICATION FAILED");
			System.out.println("*********");
			}
			System.out.println("*** THANK YOU FOR VISITING CAMERA RENTAL PROJECT ***");
				

	}
		}
