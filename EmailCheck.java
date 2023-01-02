/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapngoailecanban.checkmail;

/**
 *
 * @author KINHTHANH
 */
public class EmailCheck 
{
    public static void check(String str) throws EmailAddress
    {
        int place = str.indexOf('@');
        if(place==-1)
        {
            throw new EmailAddress("khong hop le do khong chua @");
        }
        if(place==0)
        {
            throw new EmailAddress("@ o vi tri dau tien");
        }
        place = str.indexOf('@', (place+1));
        if(place!=-1)
        {
            throw new EmailAddress("do co chua hon 1 ki tu '@'");
        }
        System.out.println("dai chi email hop le");
    }
}
