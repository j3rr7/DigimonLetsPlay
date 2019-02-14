/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digimonletsplay;
import java.util.*;
/**
 *
 * @author adgry
 */
public class DigimonLetsPlay {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Digi mon = new Digi();
		// TODO code application logic here
		Boolean gameover = false;
                int maxHP = 0,maxMP = 0;
		while (!gameover)
		{
                    if (maxHP < mon.getHP() || maxMP < mon.getMP())
                    {
                        maxHP = mon.getHP();
                        maxMP = mon.getMP();
                    }
			System.out.println("1. Training Ground");
			System.out.println("2. Battle Arena");
			System.out.println("3. Shop");
			System.out.println("4. Home");
			System.out.println("5. Digimon");
			int menu = sc.nextInt();
			if (menu == 1)
			{
				System.out.println("Peralatan:");
				System.out.println("1. Skipping");
				System.out.println("2. Sandsack");
				System.out.println("3. Treadmill");
                                System.out.println("Else Back to Menu");
				int training = sc.nextInt();
				mon.Training(training);
			}
			else if (menu == 2)
			{
				System.out.println("Musuh:");
				System.out.println("1. Agumon");
				System.out.println("2. Gabumon");
				System.out.println("3. Tantomon");
                                System.out.println("Else Back to Menu");
				int musuh = sc.nextInt();
                                mon.Battle(musuh);
			}
			else if (menu == 3)
			{
                            int shop;
                            do
                            {
				System.out.println("Shop:");
				System.out.println("ITEM LIST");
				System.out.println("1. Meat      | $100");
				System.out.println("2. Coca-Cola | $80");
				System.out.println("3. Pudding   | $50");
                                System.out.println("Else Back to Menu");
				shop = sc.nextInt();
                                mon.itemShop(shop);
                            }while(shop <= 3);
			}
			else if (menu == 4)
			{
				System.out.println("Perabotan:");
				System.out.println("1. BED");
				System.out.println("2. TV");
                                System.out.println("Else Back to Menu");
				int home = sc.nextInt();
                                mon.HOME(home,maxHP,maxMP);
			}
			else if (menu == 5)
			{
				System.out.println("=======STATUS=======");
				System.out.println("HP : " + mon.getHP());
				System.out.println("MP : " + mon.getMP());
				System.out.println("Attack : " + mon.getATTACK());
				System.out.println("Defend : " + mon.getDEFEND());
				System.out.println("Happiness : " + mon.getHAPPINESS());
				System.out.println("MONEY : " + mon.getUANG());
				System.out.println("=====INVENTORY=====");
                                mon.getINVENTORY();
                                System.out.println("====================");
                                System.out.println("Use Inventory : \n1. Meat \n2. Coca-cola \n3. Pudding \n");
                                System.out.println("Else Back to Menu");
				int digimon = sc.nextInt();
                                mon.UseInventory(digimon);
			}
		}
	}
}
