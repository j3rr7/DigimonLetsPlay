/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digimonletsplay;

import java.util.Scanner;

/**
 *
 * @author adgry
 */
public class Digi {
    private int HP,MP,ATTACK,DEFEND,HAPPINESS,UANG;
    private int HP_ENEMY,MP_ENEMY,ATTACK_ENEMY,DEFEND_ENEMY;
    private int meat,cola,pudding;
    
    public Digi() {
        HP = 20;
        MP = 10;
        ATTACK = 3;
        DEFEND = 3;
        HAPPINESS = 5;
        UANG = 1000;
    }
    public void Training(int x)
    {
        if (x == 1)
        {
            ATTACK += 2;
            DEFEND += 2;
        }
        else if (x == 2)
        {
            ATTACK += 3;
            DEFEND += 1;
        }
        else if (x == 3)
        {
            ATTACK += 1;
            DEFEND += 3;            
        }
    }
    public void Battle(int x)
    {
        Scanner anu = new Scanner(System.in);
        if (x == 1)
        {
            HP_ENEMY = 20;
            MP_ENEMY = 15;
            ATTACK_ENEMY = 4;
            DEFEND_ENEMY = 3;
        }
        else if (x == 2)
        {
            HP_ENEMY = 30;
            MP_ENEMY = 30;
            ATTACK_ENEMY = 6;
            DEFEND_ENEMY = 2;
        }
        else if (x == 3)
        {
            HP_ENEMY = 40;
            MP_ENEMY = 20;
            ATTACK_ENEMY = 9;
            DEFEND_ENEMY = 4;
        }
        HP -= 4;
        MP -= 4;
    }
    
    public void itemShop(int x)
    {
        if (x == 1)
        {
            if (UANG < 0)
            {
                System.out.println("Uang Tidak Cukup");
            }
            else 
            {
                UANG -= 100;
                meat += 1;
            }
        }
        else if (x == 2)
        {
            if (UANG < 0)
            {
                System.out.println("Uang Tidak Cukup");
            }
            else 
            {
                UANG -= 80;
                cola += 1;                
            }
        }
        else if (x == 3)
        {
            if (UANG < 0)
            {
                System.out.println("Uang Tidak Cukup");
            }
            else
            {
                UANG -= 50;
                pudding += 1;                
            }
        }
    }

    
    public void getINVENTORY()
    {
        System.out.println("Meat : " + meat);
        System.out.println("Cola : " + cola);
        System.out.println("Pudding : " + pudding);
    }
    
    public void HOME(int x, int MaxHP,int MaxMP)
    {
        if (x == 1)
        {
            HP = MaxHP;
            MP = MaxMP;
        }
        else if (x == 2)
        {
            HAPPINESS = 5;
        }
    }
    
    public void UseInventory(int x)
    {
        if (x == 1)
        {
            if (meat <= 0)
            {
                System.out.println("You dont have such item \nPlease Buy at shop...");
            }
            else
            {
                meat -= 1;
                HAPPINESS += 2;
                HP += 5;
                if (HAPPINESS > 5)
                {
                    HAPPINESS = 5;
                }                
            }
        }
        else if (x == 2)
        {
            if (cola <= 0)
            {
                System.out.println("You dont have such item \nPlease Buy at shop...");
            }
            else 
            {
                cola -= 1;
                HAPPINESS += 5;
                MP += 3;
                if (HAPPINESS > 5)
                {
                    HAPPINESS = 5;
                }                
            }
        }
        else if (x == 3)
        {
            if (pudding <= 0)
            {
                System.out.println("You dont have such item \nPlease Buy at shop...");
            }
            else
            {
                pudding -= 1;
                HAPPINESS += 2;
                HP += 4;
                MP += 2;
                if (HAPPINESS > 5)
                {
                    HAPPINESS = 5;
                }
            }
        }
    }
    
    public int getHP()
    {
        return HP;
    }
    public int getMP()
    {
        return MP;
    }
    public int getATTACK()
    {
        return ATTACK;
    }
    public int getDEFEND()    
    {
        return DEFEND;
    }
    public int getHAPPINESS()
    {
        return HAPPINESS;
    }
    public int getUANG()
    {
        return UANG;
    }
}
