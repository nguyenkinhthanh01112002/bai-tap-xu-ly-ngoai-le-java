/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapngoailecanban.checkmail;

import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class Main 
{
    public static void main(String[] args) throws EmailAddress 
    {
        try
        {
            Scanner kb = new Scanner(System.in);
            String mail = kb.nextLine();
            EmailCheck email = new EmailCheck();
            email.check(mail);
        }
        catch(EmailAddress e)
        {
            System.out.println(""+e.getMessage());
        }
    }
}
